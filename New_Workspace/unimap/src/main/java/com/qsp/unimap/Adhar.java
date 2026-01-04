package com.qsp.unimap;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adhar {

	@Id
	private int number;
	private int pincode;
	private String city;
	
	public Adhar() {
	}
	
	

	public Adhar(int number, int pincode, String city) {
		this.number = number;
		this.pincode = pincode;
		this.city = city;
	}



	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Adhar [number=" + number + ", pincode=" + pincode + ", city=" + city + "]";
	}
	
	
}
