package com.example.auth.config;

import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.SecurityConfigurer;

import javax.servlet.Filter;

/**
 * TODO
 *
 * @author C.HD
 * @since 1.0
 */
public interface WebSecurityConfigurer<T extends SecurityBuilder<Filter>> extends SecurityConfigurer<Filter, T> {}
