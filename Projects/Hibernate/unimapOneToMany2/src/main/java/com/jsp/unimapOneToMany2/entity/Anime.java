package com.jsp.unimapOneToMany2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Anime {

	@Id
	private String Arc;
	private int Esp;
	
	public Anime() {
	}

	public Anime(String arc, int esp) {
		Arc = arc;
		Esp = esp;
	}

	public String getArc() {
		return Arc;
	}

	public void setArc(String arc) {
		Arc = arc;
	}

	public int getEsp() {
		return Esp;
	}

	public void setEsp(int esp) {
		Esp = esp;
	}
	
	
	
}
