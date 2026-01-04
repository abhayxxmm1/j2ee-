package com.jsp.Constructordi;

import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;
	
	public Car() {
		System.out.println("Car no arg");
	}

	public Car(Engine engine) {
		this.engine = engine;
	}
	
	
}
