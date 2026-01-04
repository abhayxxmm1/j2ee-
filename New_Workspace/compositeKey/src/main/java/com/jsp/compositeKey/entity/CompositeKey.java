package com.jsp.compositeKey.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CompositeKey implements Serializable{

	private int id;
	private String status;
	
	@Override
	public String toString() {
		return "CompositeKey [id=" + id + ", status=" + status + "]";
	}

	public CompositeKey() {
	}

	public CompositeKey(int id, String status) {
		this.id = id;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
