package com.jenkin;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinDemoApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinDemoApplication.class);

	@PostConstruct
	public void init() {
		logger.info("application started");
	}

	public static void main(String[] args) {

		logger.info("application executing");
		SpringApplication.run(JenkinDemoApplication.class, args);
	}

}
