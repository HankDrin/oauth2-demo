package com.example.auth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.util.List;

/**
 * TODO
 *
 * @author C.HD
 * @since 1.0
 */
@EnableWebSecurity
public class CompositeWebSecurityConfigurer extends WebSecurityConfigurerAdapter {

    private List<com.example.auth.config.WebSecurityConfigurer> webSecurityConfigurers;

    @Autowired(required = false)
    public void
    setWebSecurityConfigurers(List<com.example.auth.config.WebSecurityConfigurer> webSecurityConfigurerList) {
        this.webSecurityConfigurers = webSecurityConfigurerList;
    }

    protected void configure(HttpSecurity http) throws Exception {
        for (WebSecurityConfigurer c : webSecurityConfigurers) {
            c.configure(http);
        }
    }

}
