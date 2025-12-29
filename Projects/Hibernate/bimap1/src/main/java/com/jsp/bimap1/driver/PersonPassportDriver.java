package com.jsp.bimap1.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.bimap1.entity.Passport;
import com.jsp.bimap1.entity.Person;

public class PersonPassportDriver {

	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("bm").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = new Person();
		p.setId(101);
		p.setAge(20);
		
		
		Passport pass = new Passport();
		pass.setId(201);
		pass.setName("Omkar Darekar");
		pass.setValidity(2030);
		
		p.setPassport(pass);
		pass.setPerson(p);
		
		et.begin();
		em.persist(p);
		et.commit();
		
	}
}
