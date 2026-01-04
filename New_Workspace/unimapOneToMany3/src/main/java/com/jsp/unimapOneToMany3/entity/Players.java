package com.jsp.unimapOneToMany3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Players {

	@Id
	private int id;
	private String name;
	private String Car;
	public Players() {
	}
	public Players(int id, String name, String car) {
		this.id = id;
		this.name = name;
		Car = car;
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
	public String getCar() {
		return Car;
	}
	public void setCar(String car) {
		Car = car;
	}
	@Override
	public String toString() {
		return "Players [id=" + id + ", name=" + name + ", Car=" + Car + "]";
	}
	
}
