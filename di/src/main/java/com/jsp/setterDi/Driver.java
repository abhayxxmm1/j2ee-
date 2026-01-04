package com.jsp.setterDi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.di.myConfig;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(myConfig.class);
		Mobile mobile=ac.getBean(Mobile.class);
		mobile.call("Jio");
	}
}
