package com.jsp.unimapWithCascading2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Principal {


	@Id
	private int id;
	private String name;
	
	public Principal() {
	}

	public Principal(int id, String name) {
		this.id = id;
		this.name = name;
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
	
}
