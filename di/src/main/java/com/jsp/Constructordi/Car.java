package com.jsp.Constructordi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;
	
//	@Autowired
	public Car() {
		System.out.println("Car no arg");
	}

//	public Car(Engine engine) {
//		this.engine = engine;
//	}
	
	
}
