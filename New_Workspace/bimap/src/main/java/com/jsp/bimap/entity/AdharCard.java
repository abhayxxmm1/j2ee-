package com.jsp.bimap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AdharCard {

	@Override
	public String toString() {
		return "AdharCard [num=" + num + ", loc=" + loc + ", pincode=" + pincode + ", person=" + person + "]";
	}

	@Id
	private int num;
	private String loc;
	private int pincode;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Person person;
	
	public AdharCard() {
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
