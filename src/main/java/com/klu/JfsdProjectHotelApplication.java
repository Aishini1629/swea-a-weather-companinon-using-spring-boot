package com.klu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.klu")
public class JfsdProjectHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(JfsdProjectHotelApplication.class, args);
		System.out.println("Hello World!");
	}

}
