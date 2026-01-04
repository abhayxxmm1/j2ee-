package com.jsp.unimap1Driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.unimap1.Employee;
import com.jsp.unimap1.PanCard;

public class EmploeePanCardDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Employee e=new Employee(10, "chinmay", "pro-devloper");
//		PanCard p=new PanCard("SSGD231", 425001, 23, e);
//		
//		et.begin();
//		em.persist(e);
//		em.persist(p);
//		et.commit();

		PanCard p =em.find(PanCard.class, "SSGD231");
		System.out.println(p);
	}
}
