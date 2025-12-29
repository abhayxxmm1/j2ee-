package com.jsp.unimap2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Pm {

	@Id
	private int no;
	private String name;
	private String city;
	
	@OneToOne
	private Country country;

	public Pm() {
	}

	public Pm(int no, String name, String city, Country country) {
		this.no = no;
		this.name = name;
		this.city = city;
		this.country = country;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Pm [no=" + no + ", name=" + name + ", city=" + city + ", country=" + country + "]";
	}
}
