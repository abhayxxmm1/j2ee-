package com.jsp.unimapManyToOne2.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.unimapManyToOne2.entity.India;
import com.jsp.unimapManyToOne2.entity.UnionTerritories;

public class UnionTerritoriesIndiaDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("p");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		India india = new India(91, 1947);
		
		UnionTerritories un1 = new UnionTerritories(1,"Andaban & Nicobar", 1956, india);
		UnionTerritories un2 = new UnionTerritories(2,"Candhighar", 1966, india);
		UnionTerritories un3 = new UnionTerritories(3,"Dadra & Nagar Haveli and Daman & Diu", 2020, india);
		UnionTerritories un4= new UnionTerritories(4,"Delhi(NCT)", 1956, india);
		UnionTerritories un5= new UnionTerritories(5,"Jammu & Kashmir", 2019, india);
		UnionTerritories un6= new UnionTerritories(6,"ladhakh", 2019, india);
		UnionTerritories un7= new UnionTerritories(7,"Lakshadweep", 1956, india);
		UnionTerritories un8= new UnionTerritories(8,"Punducherry", 1962, india);
		
		et.begin();
		em.persist(india);
		em.persist(un1);
		em.persist(un2);
		em.persist(un3);
		em.persist(un4);
		em.persist(un5);
		em.persist(un6);
		em.persist(un7);
		em.persist(un8);
		
		
		et.commit();
	}
}
