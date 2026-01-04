package com.jsp.hibernateEhCache.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernateEhCache.entity.Marker;

public class MarkerDriver {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
		EntityManager em1 = emf.createEntityManager();
		EntityTransaction et = em1.getTransaction();
		
		Marker marker1 = new Marker(101, "red", 50);
		Marker marker2 = new Marker(102, "blue", 60);
		
		Marker m1 = em1.find(Marker.class, 101);
		Marker m2 = em1.find(Marker.class, 101);
		Marker m3 = em1.find(Marker.class, 101);

		EntityManager em2 = emf.createEntityManager();
		Marker m4 = em2.find(Marker.class, 101);
		Marker m5 = em2.find(Marker.class, 101);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
//		et.begin();
//		em1.persist(marker1);
//		em1.persist(marker2);
//		et.commit();
	}
}
