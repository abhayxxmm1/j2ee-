package com.jsp.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.springcore.ApplicationContext.Devloper;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext aContext=new AnnotationConfigApplicationContext(Config.class);
	}
}
