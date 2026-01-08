package com.jsp.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	private Engine engine;
//	private Engine engine=new Engine();

	public void move() {

		engine.start();
		
		/// ucan make the stmts up and down for understanding the flow of exe
		
		System.out.println("Car started moving.....");
	}
}
