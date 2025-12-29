package com.jsp.unimapManyToMany.driver;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.unimapManyToMany.entity.Course;
import com.jsp.unimapManyToMany.entity.Student;

public class StudentCourseDriver {

	public static void main(String[] args) {
		 EntityManager em = Persistence.createEntityManagerFactory("pg").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Course c = new Course(1,"sql", 5550.0);
		Course c1 = new Course(2,"JAVA", 15550.0);
		Course c2 = new Course(3,"j2ee", 15550.0);
		Course c3 = new Course(4,"plsql", 5550.0);
		
		List<Course> studeList1=Arrays.asList(c,c2);
		Student s1 = new Student(15, "chinmay", 20, studeList1);

		List<Course> studeList2=Arrays.asList(c,c2,c1);
		Student s2 = new Student(16, "abhi", 20, studeList2);
		
		List<Course> studeList3=Arrays.asList(c,c2,c1,c3);
		Student s3 = new Student(17, "amit", 20, studeList3);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(c);
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		
		et.commit();
		
	}
}
