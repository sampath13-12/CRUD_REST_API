package com.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudProApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudProApplication.class, args);
		System.out.println("Spring Boot Execution started");
	}
}
