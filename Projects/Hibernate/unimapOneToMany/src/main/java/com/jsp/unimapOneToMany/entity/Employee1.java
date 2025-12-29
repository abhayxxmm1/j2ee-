package com.jsp.unimapOneToMany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee1 {

	@Id
	private int id;
	private String name;
	private double Salary;
	public Employee1() {
	}
	public Employee1(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		Salary = salary;
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
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
}
