package com.ustglobal.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernet.dto.Product;

public class InsertDemo {

	 public static void main(String[] args) {
		Product product = new Product();
		product.setPid(101);
		product.setPname("pen");
		product.setPquantity(10);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(product);
		System.out.println("record saved");
		entityTransaction.commit();
		entityManager.close();
		
	}
}
