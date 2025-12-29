package com.jsp.hibernateEhCache.entity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;

@Entity
@Cacheable(value = true)
public class Marker {

	@Id
	private int id;
	private String col;
	private int price;
	
	public Marker() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Marker [id=" + id + ", col=" + col + ", price=" + price + "]";
	}

	public Marker(int id, String col, int price) {
		super();
		this.id = id;
		this.col = col;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCol() {
		return col;
	}

	public void setCol(String col) {
		this.col = col;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
