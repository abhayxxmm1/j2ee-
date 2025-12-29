package com.jsp.unimapManyToOne2.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UnionTerritories {

	@Id
	private int id;
	private String name;
	private int year;
	
	@ManyToOne
	private India india;

	public UnionTerritories() {
	}
	public UnionTerritories(int id, String name, int year, India india) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.india = india;
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
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public India getIndia() {
		return india;
	}
	public void setIndia(India india) {
		this.india = india;
	}
	@Override
	public String toString() {
		return "UnionTerritories [id=" + id + ", name=" + name + ", year=" + year + ", india=" + india + "]";
	}
	
	
}
