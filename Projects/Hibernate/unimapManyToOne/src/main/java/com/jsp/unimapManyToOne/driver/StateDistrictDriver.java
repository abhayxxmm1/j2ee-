package com.jsp.unimapManyToOne.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.unimapManyToOne.entity.District;
import com.jsp.unimapManyToOne.entity.State;

public class StateDistrictDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		State s = new State(10, "Maharastra", "Deventra");
		District d1 = new District(101, "jalgaon", 425001, s);
		District d2 = new District(102, "Pune", 411022, s);
		

		et.begin();
		em.persist(s);
		em.persist(d1);
		em.persist(d2);
		
		et.commit();
	}
}
