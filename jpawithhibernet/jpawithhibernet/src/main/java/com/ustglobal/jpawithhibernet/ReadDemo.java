package com.ustglobal.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernet.dto.Product;

public class ReadDemo {
    public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product productDetail=entityManager.find(Product.class, 101);
		System.out.println("ID---"+productDetail.getPid());
		System.out.println("Name--"+productDetail.getPname());
		System.out.println("Quantity--"+productDetail.getPquantity());
		entityManager.close();
	}
}
