package com.jsp.xample;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {

		ApplicationContext ac=new AnnotationConfigApplicationContext(myConfig.class);
		Car bean = ac.getBean(Car.class);
		bean.move();
	}
}
