package com.jsp.unimapWithCascading.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

@Entity
public class Hospital {

	@Id
	private int id;
	private String name;
	private String location;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Doctors> doctors;
	
	@OneToOne(cascade = CascadeType.ALL)
	private MD md;
	
	public Hospital() {
	}

	public Hospital(int id, String name, String location, List<Doctors> doctors, MD md) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.doctors = doctors;
		this.md = md;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Doctors> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctors> doctors) {
		this.doctors = doctors;
	}

	public MD getMd() {
		return md;
	}

	public void setMd(MD md) {
		this.md = md;
	}
	
}
