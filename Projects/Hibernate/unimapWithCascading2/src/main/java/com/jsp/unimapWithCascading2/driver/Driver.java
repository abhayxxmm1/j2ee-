package com.jsp.unimapWithCascading2.driver;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.unimapWithCascading2.entity.BranchHead;
import com.jsp.unimapWithCascading2.entity.Branches;
import com.jsp.unimapWithCascading2.entity.Bus;
import com.jsp.unimapWithCascading2.entity.College;
import com.jsp.unimapWithCascading2.entity.Principal;
import com.jsp.unimapWithCascading2.entity.University;

public class Driver {

	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("p").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		
		com.jsp.unimapWithCascading2.entity.Driver d1 = new com.jsp.unimapWithCascading2.entity.Driver(901, "devin");
		com.jsp.unimapWithCascading2.entity.Driver d2 = new com.jsp.unimapWithCascading2.entity.Driver(902, "calvin");
		
		Bus b1 = new Bus(950, 2345, d1);
		Bus b2 = new Bus(951, 5432, d2);
		List<Bus> bList1=Arrays.asList(b1,b2);
		
		Principal p1 = new Principal(801, "Tejus");
		Principal p2 = new Principal(802, "Pawan");
		List<Principal> pList=Arrays.asList(p1,p2);
		
		BranchHead bh1 = new BranchHead(701, "Nilesh");
		BranchHead bh2 = new BranchHead(702, "Wani");
		BranchHead bh3 = new BranchHead(703, "Meghya");
		BranchHead bh4 = new BranchHead(704, "Ingde");
		List<BranchHead> bhlList1=Arrays.asList(bh1,bh2);
		List<BranchHead> bhlList2=Arrays.asList(bh3,bh4);
		
		Branches br1 = new Branches(70001, "computer", bhlList1);
		Branches br2 = new Branches(70002, "E&TC", bhlList2);
		
		List<Branches> brlList=Arrays.asList(br1,br2);
		
		College c1 = new College(301, "NMCUE", pList, brlList, bList1);
		List<College> cList=Arrays.asList(c1);
		
		University u1 = new University(101, "DBATU", cList);
		
		
		et.begin();
		em.persist(u1);
		et.commit();
	}
}
