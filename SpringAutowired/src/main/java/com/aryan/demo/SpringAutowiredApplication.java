package com.aryan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAutowiredApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringAutowiredApplication.class, args);
		
		Laptop lap=context.getBean(Laptop.class);
		lap.start();
	}

}
