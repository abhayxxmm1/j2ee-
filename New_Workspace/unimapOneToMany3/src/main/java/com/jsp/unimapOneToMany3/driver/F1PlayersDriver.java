package com.jsp.unimapOneToMany3.driver;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.unimapOneToMany3.entity.F1;
import com.jsp.unimapOneToMany3.entity.Players;

public class F1PlayersDriver {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("p").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Players p1 = new Players(1, "Verstappen", "RedBull");
		Players p2 = new Players(2, "leclerc", "Ferrari");
		Players p3 = new Players(3, "Hamilton", "Ferrari");
		
		List<Players> players1=Arrays.asList(p1,p2,p3);
		F1 f1 = new F1(100, "Abu Dabi Grand Prix",12.5, players1);
		
		
		et.begin();
//		em.persist(f1);
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
		
		F1 f12 = em.find(F1.class, 100);
		System.out.println(f12);
		et.commit();
		
	}
}
