package com.engineers.hotelmanagement;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication(scanBasePackages = "com.engineers")
public class HotelmanagementApplication {

	private static final Logger LOGGER = Logger.getLogger(HotelmanagementApplication.class.getName());
	public static void main(String[] args) {
		SpringApplication.run(HotelmanagementApplication.class, args);
		LOGGER.info("This is info");
		LOGGER.log(Level.FINE, "This is debug");
		System.out.println(org.slf4j.LoggerFactory.getILoggerFactory().getClass().getName());

		// slf4j ->  logback, log4j
		// Database Driver -> Postgres, JDBC

	}

}

/*
TODO:
1. Lombok
2. Memory:  heap vs stack -> Done
3. Enum
4. Content Negotiation

 */