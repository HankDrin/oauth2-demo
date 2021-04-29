package com.example.auth.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

/**
 * 控制容器中WebSecurityConfigurerAdapter实例最多仅存在一个
 *
 * {@link WebSecurityConfigurerAdapter}
 *
 * @author C.HD
 * @since 1.0
 */
@Component
public class MyContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext applicationContext = event.getApplicationContext();

        if (applicationContext.getBeanNamesForType(WebSecurityConfigurerAdapter.class).length > 1) {
            throw new RuntimeException("WebSecurityConfigurerAdapter only one occurrence is allowed.");
        }
    }
}
