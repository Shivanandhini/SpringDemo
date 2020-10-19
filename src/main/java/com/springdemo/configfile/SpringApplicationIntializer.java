package com.springdemo.configfile;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringApplicationIntializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(SpringDemoConfigFile.class);

		// create Dispatcher servlet object
		DispatcherServlet dispatcherservlet = new DispatcherServlet(webApplicationContext);
		// register dispatcher servlet object with the servlet context object
		ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("dispatcherServlet",
				dispatcherservlet);
		myCustomDispatcherServlet.setLoadOnStartup(1);
		myCustomDispatcherServlet.addMapping("/mywebsite.com/*");
	}

}
