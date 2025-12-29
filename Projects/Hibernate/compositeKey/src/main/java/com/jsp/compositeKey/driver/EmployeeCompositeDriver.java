package com.jsp.compositeKey.driver;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.compositeKey.entity.CompositeKey;
import com.jsp.compositeKey.entity.Employee;

public class EmployeeCompositeDriver {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("pg").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		CompositeKey cKey = new CompositeKey(101, "absent");
		Employee e1 = new Employee("Mike", 2000000.0, LocalDate.now(), cKey);
		
		
		Employee e2 = em.find(Employee.class, cKey);
		System.out.println(e2);
		
//		et.begin();
//		em.persist(e1);
//		et.commit();
	}
}
