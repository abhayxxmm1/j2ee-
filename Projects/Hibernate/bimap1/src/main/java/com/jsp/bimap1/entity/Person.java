package com.jsp.bimap1.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", passport=" + passport + "]";
	}

	@Id
	private int id;
	private int age;

	@OneToOne(cascade = CascadeType.ALL)
	private Passport passport;

	public Person() {
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	
	
}
