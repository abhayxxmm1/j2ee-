package hibernate;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;


public class Entity_Hibernate {

	public static void main(String[] args) {
		
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
	
	EntityManager em= emf.createEntityManager();
	EntityTransaction et= em.getTransaction();
	

	Car c1=new Car();
	c1.setId(1);
	c1.setBrand("TATA");
	c1.setPrice(500.0);
	
	et.begin();
	em.persist(c1);
	et.commit();
	
	System.out.println("Inserted");
		
	}

	

	
}
