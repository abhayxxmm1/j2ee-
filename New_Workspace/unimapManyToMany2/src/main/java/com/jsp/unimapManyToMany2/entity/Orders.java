package com.jsp.unimapManyToMany2.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Orders {

	@Id
	@Column(name = "OrderID")
	private int id;
	@Column(name = "User_name")
	private String name;


	@ManyToMany
	List<Products> products;
	
	public Orders() {
	}


	public Orders(int id, String name, List<Products> products) {
		this.id = id;
		this.name = name;
		this.products = products;
	}


	public List<Products> getProducts() {
		return products;
	}


	public void setProducts(List<Products> products) {
		this.products = products;
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

	@Override
	public String toString() {
		return "Orders [id=" + id + ", name=" + name + ", products=" + products + "]";
	}
	
}
