package com.qsp.unimapDriver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qsp.unimap.Adhar;
import com.qsp.unimap.Person;

public class PersonAdharDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=  Persistence.createEntityManagerFactory("dev");
		EntityManager em =emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		///for inserting data  perfom this
//		Adhar adhar = new Adhar(123456, 5001, "Pune");
//		Person person= new Person(101, "Ram", 21, adhar);
		
//		et.begin();
//		em.persist(person);
//		em.persist(adhar);
//		
//		
//		et.commit();

		Person p= em.find(Person.class, 101);
		System.out.println(p);
	}
}
