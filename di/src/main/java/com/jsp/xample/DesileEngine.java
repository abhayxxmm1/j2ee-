package com.jsp.xample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "desile")
@Primary
public class DesileEngine implements Engine{

	public void start()
	{
		System.out.println("Desile engine started...");
	}
	
}
