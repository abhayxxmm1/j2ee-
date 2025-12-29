package com.jsp.bimap1.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {

	@Id
	private int id;
	private String name;
	private int validity;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Person person;
	public Passport() {
	}
	
	@Override
	public String toString() {
		return "Passport [id=" + id + ", name=" + name + ", validity=" + validity + ", person=" + person + "]";
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
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
