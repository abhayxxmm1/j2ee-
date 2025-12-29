package com.jsp.unimapWithCascading2.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bus {


	@Id
	private int id;
	private int no;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Driver driver;
	
	public Bus() {
	}

	public Bus(int id, int no, Driver driver) {
		this.id = id;
		this.no = no;
		this.driver = driver;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
}
