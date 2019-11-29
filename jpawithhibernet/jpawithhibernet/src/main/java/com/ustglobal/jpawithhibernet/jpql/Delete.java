package com.ustglobal.jpawithhibernet.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		String jpql = "Delete from Product where pid=101";
		Query query = entityManager.createQuery(jpql);

		int result =query.executeUpdate();


		System.out.println(result);
		transaction.commit();

		entityManager.close();
	}

}

