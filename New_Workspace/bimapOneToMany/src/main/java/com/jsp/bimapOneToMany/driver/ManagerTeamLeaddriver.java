package com.jsp.bimapOneToMany.driver;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.bimapOneToMany.entity.Manager;
import com.jsp.bimapOneToMany.entity.TeamLead;

public class ManagerTeamLeaddriver {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("bm").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Manager m = new Manager();
		m.setId(110);
		m.setName("Virat");
		m.setSalary(234314.0);
		
		TeamLead tl = new TeamLead();
		tl.setId(10);
		tl.setName("Arun");
		tl.setSkill("java");
		tl.setSalary(1324.0);
		tl.setManager(m);
		
		TeamLead tl1 = new TeamLead();
		tl1.setId(11);
		tl1.setName("Aditya");
		tl1.setSkill("python");
		tl1.setSalary(13224.0);
		tl1.setManager(m);
		
		TeamLead tl2 = new TeamLead();
		tl2.setId(12);
		tl2.setName("Ajay");
		tl2.setSkill("javaScript");
		tl2.setSalary(13274.0);
		tl2.setManager(m);
		
		List<TeamLead> tList=Arrays.asList(tl,tl1,tl2);
		
		m.setTeamLead(tList);
		
		et.begin();
		
		em.persist(m);
		et.commit();
		
		
	}
}
