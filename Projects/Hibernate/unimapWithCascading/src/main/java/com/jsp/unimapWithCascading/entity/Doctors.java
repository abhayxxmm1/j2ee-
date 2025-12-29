package com.jsp.unimapWithCascading.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

@Entity
public class Doctors {

	@Id
	private int id;
	private String name;
	private double sal;
	private String specialist;
	
	@OneToMany(cascade = CascadeType.ALL)

	List<Patient> patients;
	
	public Doctors() {
	}

	public Doctors(int id, String name, double sal, String specialist, List<Patient> patients) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.specialist = specialist;
		this.patients = patients;
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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	
	
}
