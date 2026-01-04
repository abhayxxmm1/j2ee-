package com.jsp.unimapWithCascading.driver;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.unimapWithCascading.entity.Doctors;
import com.jsp.unimapWithCascading.entity.Hospital;
import com.jsp.unimapWithCascading.entity.MD;
import com.jsp.unimapWithCascading.entity.Patient;

public class Driver {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("p").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		MD md = new MD(103, "mahesh",9000.0);
		
		Patient p1 = new Patient(301, "Omkar", "headache");
		Patient p2 = new Patient(302, "chinmay", "cold");
		Patient p3 = new Patient(303, "abhay", "fever");
		Patient p4 = new Patient(304, "amit", "brain tumer");
		List<Patient> pList1=Arrays.asList(p1,p2);
		List<Patient> pList2=Arrays.asList(p3,p4);
		
		Doctors doc1=new Doctors(501, "shruti", 2000, "general", pList1);
		Doctors doc2=new Doctors(502, "abhijit", 20000, "neuro", pList2);
		
		List<Doctors> doclList3=Arrays.asList(doc2,doc1);
		
		Hospital hospital = new Hospital(405, "Aims", "delhi", doclList3, md);
		
		et.begin();
		em.persist(hospital);
		et.commit();
		
	}
}
