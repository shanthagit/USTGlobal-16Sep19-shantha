package com.ustglobal.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernet.dto.Product;

public class ReAttaching {
  public static void main(String[] args) {
	 EntityManager entityManager = null;
	 EntityTransaction entityTransaction = null;
	    try {
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		 entityManager= entityManagerFactory.createEntityManager();
		 entityTransaction=entityManager.getTransaction();
		 entityTransaction.begin();
		 Product product = entityManager.find(Product.class, 101);
		 System.out.println(entityManager.contains(product));   //another method to get the data of database
		 entityManager.detach(product);
		 System.out.println(entityManager.contains(product));
		 Product product1 = entityManager.merge(product);
		 product1.setPname("baba");
		 System.out.println("updated record");
		 entityTransaction.commit();
	    } catch(Exception e) {
	    	e.printStackTrace();
	    	entityTransaction.rollback();
	    	
	    	
	    }
	    entityManager.close();
}
}
