package com.aryan.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cpu {
	
	@Autowired
	Electricity elect;
	
	public void run()
	{
		elect.flow();
		System.out.println("Cpu is running");
	}

}
