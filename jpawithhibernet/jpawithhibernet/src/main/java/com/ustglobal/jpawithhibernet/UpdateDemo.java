package com.ustglobal.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernet.dto.Product;

public class UpdateDemo {
    public static void main(String[] args) {
    	EntityManager entityManager = null;
    	EntityTransaction entityTransaction =null;
    	try {
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		 entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Product product = entityManager.find(Product.class,101);
		product.setPname("ram");
		System.out.println("Updated record");
		entityTransaction.commit();
		
		
	} catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
    	entityManager.close();
}
}
