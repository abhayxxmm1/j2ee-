package com.jsp.unimapWithCascading2.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {


	@Id
	private int id;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Principal> principals;
	@OneToMany(cascade = CascadeType.ALL)
	List<Branches> branches;
	@OneToMany(cascade = CascadeType.ALL)
	List<Bus> bus;
	
	public College() {
	}

	public College(int id, String name, List<Principal> principals, List<Branches> branches, List<Bus> bus) {
		this.id = id;
		this.name = name;
		this.principals = principals;
		this.branches = branches;
		this.bus = bus;
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

	public List<Principal> getPrincipals() {
		return principals;
	}

	public void setPrincipals(List<Principal> principals) {
		this.principals = principals;
	}

	public List<Branches> getBranches() {
		return branches;
	}

	public void setBranches(List<Branches> branches) {
		this.branches = branches;
	}

	public List<Bus> getBus() {
		return bus;
	}

	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}
	
}
