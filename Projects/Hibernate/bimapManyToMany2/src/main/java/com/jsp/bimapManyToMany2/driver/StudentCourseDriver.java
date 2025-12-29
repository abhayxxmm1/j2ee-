package com.jsp.bimapManyToMany2.driver;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.bimapManyToMany2.entity.Courses;
import com.jsp.bimapManyToMany2.entity.Students;

public class StudentCourseDriver {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("bm").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Students s1 = new Students();
		s1.setId(10);
		s1.setName("stev");
		s1.setAge(30);

		Students s2 = new Students();
		s2.setId(11);
		s2.setName("Mike");
		s2.setAge(23);
		
		List<Students> li1=Arrays.asList(s1);
		List<Students> li2=Arrays.asList(s1,s2);
		
		Courses c1 = new Courses();
		c1.setId(20);
		c1.setName("java");
		c1.setPrice(15550);

		Courses c2 = new Courses();
		c2.setId(21);
		c2.setName("sql");
		c2.setPrice(1555);
		
		List<Courses> cl1=Arrays.asList(c1);
		List<Courses> cl2=Arrays.asList(c2,c1);
		
		s1.setCourses(cl1);
		s2.setCourses(cl2);
		
		c1.setStudents(li1);
		c2.setStudents(li2);
		
		et.begin();
		em.persist(s1);
		et.commit();
		
		
		
	}
}
