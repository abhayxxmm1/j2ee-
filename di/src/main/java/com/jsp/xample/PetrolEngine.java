package com.jsp.xample;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements Engine{

	public void start()
	{
		System.out.println("petrol engine started...");
	}
}
