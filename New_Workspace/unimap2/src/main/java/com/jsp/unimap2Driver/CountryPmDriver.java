package com.jsp.unimap2Driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.unimap2.Country;
import com.jsp.unimap2.Pm;

public class CountryPmDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Country c=new Country(91, "India", 5);
//		Pm p=new Pm(20, "Narendra", "Gujrat", c);
//		
//		et.begin();
//		em.persist(p);
//		em.persist(c);
//		et.commit();
		
		Pm p=em.find(Pm.class, 20);
		System.out.println(p);
	}
}
