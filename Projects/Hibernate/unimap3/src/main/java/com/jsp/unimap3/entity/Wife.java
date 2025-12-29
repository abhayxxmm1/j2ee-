package com.jsp.unimap3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Wife {

	@Id
	private String name;
	private int age;
	private boolean job;
	
	@OneToOne
	private Person person;

	public Wife() {
		super();
	}

	public Wife(String name, int age, boolean job, Person person) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.person = person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isJob() {
		return job;
	}

	public void setJob(boolean job) {
		this.job = job;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Wife [name=" + name + ", age=" + age + ", job=" + job + ", person=" + person + "]";
	}
	
	
}
