package com.jsp.setterDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	private Sim sim;
	public Mobile() {

	}
	
	public Sim getSim() {
		return sim;
	}
	
	
	@Autowired
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	
	public void call(String name) {
		sim.active(name);
		System.out.println(name +"is calling ....");
	}
	
	
}
