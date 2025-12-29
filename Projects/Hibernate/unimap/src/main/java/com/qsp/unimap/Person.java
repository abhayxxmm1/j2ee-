package com.qsp.unimap;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	private int id;
	private String name;
	private int age;
	
	
	@OneToOne
	private Adhar adharcardAdhar;
	
	public Person() {
	}




	public Person(int id, String name, int age, Adhar adharcardAdhar) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.adharcardAdhar = adharcardAdhar;
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Adhar getAdharcardAdhar() {
		return adharcardAdhar;
	}


	public void setAdharcardAdhar(Adhar adharcardAdhar) {
		this.adharcardAdhar = adharcardAdhar;
	}





	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", adharcardAdhar=" + adharcardAdhar + "]";
	}
	

	
}
