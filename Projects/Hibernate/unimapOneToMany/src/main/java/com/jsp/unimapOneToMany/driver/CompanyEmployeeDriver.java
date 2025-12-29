package com.jsp.unimapOneToMany.driver;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.unimapOneToMany.entity.Company;
import com.jsp.unimapOneToMany.entity.Employee1;

public class CompanyEmployeeDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee1 e1 = new Employee1(101, "Ram", 500.0);
		Employee1 e2 = new Employee1(102, "shayam", 600.0);
		Employee1 e3 = new Employee1(103, "Mahesh", 700.0);
		
		List<Employee1> list=Arrays.asList(e1,e2,e3);
		
///**************************************************************
///		List<Employee1> list=new ArrayList();		
//		list.add(e1);
//		list.add(e2);
//		list.add(e3);
///**************************************************************
		
		Company c =new Company(21,"TCS","Pune",list);
		
		et.begin();
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(c);
		et.commit();
	}
}
