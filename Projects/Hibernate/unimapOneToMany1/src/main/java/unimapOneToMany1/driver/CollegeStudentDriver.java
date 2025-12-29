package unimapOneToMany1.driver;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import unimapOneToMany1.entity.College;
import unimapOneToMany1.entity.Student;

public class CollegeStudentDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ps  	");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s1 = new Student(10, "chinu", 'A');
		Student s2 = new Student(11, "amit", 'B');
		Student s3 = new Student(12, "omkar", 'd');
		Student s4 = new Student(13, "amol", 'f');
		
		List<Student> list = Arrays.asList(s1,s2,s3,s4);
		
		College qs = new College(30, "Qspiders", "deccan", list);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		em.persist(qs);
		et.commit();
	}
}
