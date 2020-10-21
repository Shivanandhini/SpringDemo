package com.springdemo.configfile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;



@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.springdemo.controller")
public class SpringDemoConfigFile {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/View/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;

	}
}
