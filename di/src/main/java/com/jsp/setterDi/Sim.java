package com.jsp.setterDi;

import org.springframework.stereotype.Component;

@Component
public class Sim {

	public void active(String name) {
		System.out.println(name+" sim in activated...");
	}
}
