package com.jsp.unimapManyToOne.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class State {

	@Id
	@Column(name="stste_data")
	private int id;
	@Column(name="st_name")
	private String name;
	private String cm;
	
	public State() {
	}
	
	public State(int id, String name, String cm) {
		this.id = id;
		this.name = name;
		this.cm = cm;
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
	public String getCm() {
		return cm;
	}
	public void setCm(String cm) {
		this.cm = cm;
	}
	
	
}
