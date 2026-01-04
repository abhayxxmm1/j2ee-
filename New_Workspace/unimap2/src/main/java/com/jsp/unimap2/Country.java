package com.jsp.unimap2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Country {

	@Id
	private int no;
	private String name;
	private int economy;
	

	public Country() {
	}

	public Country(int no, String name, int economy) {
		this.no = no;
		this.name = name;
		this.economy = economy;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEconomy() {
		return economy;
	}

	public void setEconomy(int economy) {
		this.economy = economy;
	}


	@Override
	public String toString() {
		return "Country [no=" + no + ", name=" + name + ", economy=" + economy + ", primeMinisterPm="+ "]";
	}
}
