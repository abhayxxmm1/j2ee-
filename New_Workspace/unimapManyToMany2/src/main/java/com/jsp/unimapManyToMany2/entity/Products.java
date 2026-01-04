package com.jsp.unimapManyToMany2.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Products {

	@Id
	@Column(name = "ProductID")
	private int id;
	@Column(name = "ProductName")
	private String name;
	private double price;
	
	
	public Products() {
	}

	public Products(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + ", orders=" +  "]";
	}
}
