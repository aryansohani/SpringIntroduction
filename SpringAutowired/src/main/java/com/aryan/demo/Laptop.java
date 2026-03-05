package com.aryan.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	@Autowired
	Cpu cpu;
	
	@Autowired
	Motherboard mb;
	
	public void start()
	{
		cpu.run();
		mb.run();
	}
	
	

}
