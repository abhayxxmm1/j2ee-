package com.jsp.unimapManyToOne.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class District {

	@Id
	private int id;
	private String name;
	private int pincode;
	
	@ManyToOne
	private State state;

	public District(int id, String name, int pincode, State state) {
		this.id = id;
		this.name = name;
		this.pincode = pincode;
		this.state = state;
	}

	public District() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
}
