package com.jsp.hqlDms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Developer {

	@Id
	private int id;
	private String name;
	private double salary;
	private String gender;
	private String skill;
	
	public Developer() {
	}

	public Developer(int id, String name, double salary, String gender, String skill) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.skill = skill;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Developer [id=" + id + ", name=" + name + ", salary=" + salary + ", gender=" + gender + ", skill="
				+ skill + "]";
	}
	
	
}
