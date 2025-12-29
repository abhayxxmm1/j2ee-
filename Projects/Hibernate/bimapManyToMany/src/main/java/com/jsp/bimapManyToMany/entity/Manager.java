package com.jsp.bimapManyToMany.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Manager {

	@Id
	private int id;
	private String name;
	private double salary;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<TeamLead> teamLead;
	
	
	public Manager(int id, String name, double salary, List<TeamLead> teamLead) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.teamLead = teamLead;
	}

	public Manager() {
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<TeamLead> getTeamLead() {
		return teamLead;
	}

	public void setTeamLead(List<TeamLead> teamLead) {
		this.teamLead = teamLead;
	}
	
	
}
