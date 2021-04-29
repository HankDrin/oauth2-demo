package com.example.auth.config;

import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author C.HD
 * @since 1.0
 */
@Component
public class WebSecurityConfigurerImpl implements WebSecurityConfigurer {

    @Override
    public void init(SecurityBuilder builder) throws Exception {

    }

    @Override
    public void configure(SecurityBuilder builder) throws Exception {
        if (!(builder instanceof HttpSecurity)) {
            return;
        }
        HttpSecurity http = (HttpSecurity) builder;
        http.cors()
            .and()
            .csrf()
            .disable();
    }
}
