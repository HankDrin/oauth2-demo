package com.example.auth.config;

import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * TODO
 *
 * @author C.HD
 * @since 1.0
 */
//@EnableWebSecurity
@Order(100)
public class WebSecurityConfig1 extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors()
            .and()
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .csrf()
            //            .disable()
            //            .sessionManagement()
            .and()
                        .authorizeRequests()
//                        .antMatchers(anonymous)
//                        .permitAll()
                        .antMatchers("/**")
                        .authenticated()
                        .anyRequest()
                        .permitAll()
                        .and()
            .exceptionHandling()
            .and()
            .headers()
            .cacheControl()
            .disable();

    }

}
