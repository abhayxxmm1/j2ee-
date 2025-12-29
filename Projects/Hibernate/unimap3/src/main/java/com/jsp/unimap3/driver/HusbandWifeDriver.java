package com.jsp.unimap3.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.unimap3.entity.Person;
import com.jsp.unimap3.entity.Wife;

public class HusbandWifeDriver {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("pg").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p=new Person("Amit", 22, false);
		Wife w = new Wife("null", 0, false, p);
		
		et.begin();
		em.persist(p);
		em.persist(w);
		
		et.commit();
	}
}
