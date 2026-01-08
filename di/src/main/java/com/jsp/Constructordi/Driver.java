package com.jsp.Constructordi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext aContext=new AnnotationConfigApplicationContext(Config.class);
		Car car=aContext.getBean(Car.class);
		
	}
}
