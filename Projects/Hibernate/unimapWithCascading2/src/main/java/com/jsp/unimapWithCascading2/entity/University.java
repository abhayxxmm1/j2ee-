package com.jsp.unimapWithCascading2.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
@Entity
public class University {

	@Id
	private int id;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)

	List<College> colleges;
	
	public University() {
	}

	public University(int id, String name, List<College> colleges) {
		this.id = id;
		this.name = name;
		this.colleges = colleges;
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

	public List<College> getColleges() {
		return colleges;
	}

	public void setColleges(List<College> colleges) {
		this.colleges = colleges;
	}
}
