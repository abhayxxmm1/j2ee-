package com.jsp.unimapManyToMany2.driver;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.unimapManyToMany2.entity.Orders;
import com.jsp.unimapManyToMany2.entity.Products;

public class ProductsOrdersDriver {

	public static void main(String[] args) {
		/// Method Chaining
		EntityManager em = Persistence.createEntityManagerFactory("p").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Products p1 = new Products(1, "iphone 17 pro", 120000.0);
		Products p2 = new Products(2, "M4 Air", 100000.0);
		Products p3 = new Products(3, "Duke", 380000.0);
		
		
		List<Products> pList=Arrays.asList(p1,p2,p3);
		Orders o1 = new Orders(101, "Abhay", pList);
		
		List<Products> plList1=Arrays.asList(p2,p3);
		Orders o2 = new Orders(102, "Chinmay", plList1);

		List<Products> plList2=Arrays.asList(p1,p3);
		Orders o3 = new Orders(103, "Amit", plList2);
		
		et.begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(o1);
		em.persist(o2);
		em.persist(o3);
		
		et.commit();
		
	}
}
