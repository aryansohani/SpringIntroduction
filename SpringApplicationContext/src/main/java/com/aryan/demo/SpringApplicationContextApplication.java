package com.aryan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringApplicationContextApplication {

	public static void main(String[] args) {
		
		ApplicationContext context =SpringApplication.run(SpringApplicationContextApplication.class, args);
		Alien obj=context.getBean(Alien.class);
		obj.best();
		
		Student stu=context.getBean(Student.class);
		int result=stu.add(4, 5);
		System.out.println(result);
	}

}
