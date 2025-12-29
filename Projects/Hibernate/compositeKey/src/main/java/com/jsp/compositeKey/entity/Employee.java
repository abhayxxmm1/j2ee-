package com.jsp.compositeKey.entity;

import java.awt.Composite;
import java.time.LocalDate;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Employee {

	private String name;
	private double sal;
	private LocalDate date;
	
	@EmbeddedId
	private CompositeKey key;
	
	public Employee() {
	}

	public Employee(String name, double sal, LocalDate date, CompositeKey key) {
		this.name = name;
		this.sal = sal;
		this.date = date;
		this.key = key;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + ", date=" + date + ", key=" + key + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public CompositeKey getKey() {
		return key;
	}

	public void setKey(CompositeKey key) {
		this.key = key;
	}
	
}
