package com.ustglobal.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernet.dto.Product;

public class GetReference {
     public static void main(String[] args) {
    	 EntityManager entityManager = null;
     	EntityTransaction entityTransaction =null;
     	
     	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
 		 entityManager = entityManagerFactory.createEntityManager();
 		 
 		Product product = entityManager.find(Product.class,101);
 		System.out.println(product.getClass());
 		
// 		System.out.println(product.getPid());
// 		System.out.println(product.getPname());
// 		System.out.println(product.getPquantity());
 		
 		
 	
     	entityManager.close();
	}
}
