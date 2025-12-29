package com.jsp.unimap1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PanCard {

	@Id
	private String panno;
	private int pincode;
	private int age;
	
	@OneToOne
	private Employee emp;
	
	public PanCard() {
	}

	public PanCard(String panno, int pincode, int age, Employee emp) {
		this.panno = panno;
		this.pincode = pincode;
		this.age = age;
		this.emp = emp;
	}

	public String getPanno() {
		return panno;
	}

	public void setPanno(String panno) {
		this.panno = panno;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "PanCard [panno=" + panno + ", pincode=" + pincode + ", age=" + age + ", emp=" + emp + "]";
	}
	
	
}
