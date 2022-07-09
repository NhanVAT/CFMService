package com.cfm.CFM.CFMService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootApplication
public class CfmServiceApplication extends SpringBootServletInitializer {
	private static final Logger log = LoggerFactory.getLogger(CfmServiceApplication.class);

	/**
	 * This is a helper Java class that provides an alternative to creating a {@code web.xml}
	 * This will be invoked only when the application is deployed to a Servlet container like Tomcat, JBoss etc.
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CfmServiceApplication.class);
	}

	@Bean
	public CharacterEncodingFilter characterEncodingFilter() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);
		return characterEncodingFilter;
	}

	public static void main(String[] args) {
		SpringApplication.run(CfmServiceApplication.class, args);
		log.info("CMF Service is running");
	}

}
