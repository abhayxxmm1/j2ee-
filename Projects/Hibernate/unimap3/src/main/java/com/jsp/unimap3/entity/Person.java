package com.jsp.unimap3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "husband")
public class Person {
	@Id
	private String name;
	private int age;
	private boolean job;

	public Person() {
	}

	public Person(String name, int age, boolean job) {
		this.name = name;
		this.age = age;
		this.job = job;
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", job=" + job + "]";
	}

}
