package com.example.auth.config;

import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * SpringSecurity的配置
 * 通过SpringSecurity的配置，将JWTLoginFilter，JWTAuthenticationFilter组合在一起
 * @author TF019503
 */
//@EnableWebSecurity
@Order(99)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

//    @Value("${system.anonymous.path}")
//    private String[] anonymous;

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
//            .authorizeRequests()
//            .antMatchers(anonymous)
//            .permitAll()
//            .antMatchers("/**")
//            .authenticated()
//            .anyRequest()
//            .permitAll()
//            .and()
            .exceptionHandling()
            .and()
            .headers()
            .cacheControl()
            .disable();

    }



}
