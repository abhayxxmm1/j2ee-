package com.jsp.bimap.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.bimap.entity.AdharCard;
import com.jsp.bimap.entity.Person;

public class PersonAdharDriver {

	private static final Class AdharCard = null;

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("bm").createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Person p = new Person();
		p.setId(101);
		p.setAge(20);
		p.setName("Gandu");
		
		AdharCard a = new AdharCard();
		a.setNum(12340);
		a.setLoc("deccam");
		a.setPincode(425001);
		
		p.setAdharCard(a);
		a.setPerson(p);
		
		AdharCard o = em.find(AdharCard.class, 12340);
		
		System.out.println(o);
		et.begin();
//		em.persist(a);
		et.commit();
	}
}
