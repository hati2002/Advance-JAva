package com.spring.initialise;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		Class[] configfile= {AppConfiguration.class};
		
		return configfile;
	}

	@Override
	protected String[] getServletMappings() {

		String[] mapping= {"/"};
		return mapping;
	}

}
