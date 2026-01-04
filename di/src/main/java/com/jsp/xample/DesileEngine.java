package com.jsp.xample;

import org.springframework.stereotype.Component;

@Component
public class DesileEngine implements Engine{

	public void start()
	{
		System.out.println("Desile engine started...");
	}
	
}
