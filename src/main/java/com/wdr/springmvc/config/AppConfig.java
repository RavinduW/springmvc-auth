package com.wdr.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.wdr.springmvc")
public class AppConfig {

    //define a bean for view resolver
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver intViewResolver = new InternalResourceViewResolver();

        intViewResolver.setPrefix("/WEB-INF/view/");
        intViewResolver.setSuffix(".jsp");

        return intViewResolver;
    }

}
