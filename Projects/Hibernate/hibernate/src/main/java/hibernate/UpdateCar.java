package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateCar {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Car c=em.find(Car.class, 1);
//		c.setId(2);
//		c.setBrand("Lamborgini");
		c.setPrice(1111111111111110.0);
		
		et.begin();
		em.merge(c);
		et.commit();
		System.out.println("updated");
	}
}
