package com.ustglobal.jpawithhibernet.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

public class DynamicUpdate {
	public static void main(String[] args, EntityTransaction transaction) {
		EntityManager entityManager=null;
		EntityTransaction entityTransaction = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		EntityTransaction transaction1 = entityManager1.getTransaction();
		transaction1.begin();

		String jpql = "Update Product set pquantity=70 where pid=:id";
		Query query = entityManager1.createQuery(jpql);
        query.setParameter("name", "book");
        query.setParameter("id", 101);
        
		int result =query.executeUpdate();


		System.out.println(result);
		transaction1.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
		entityManager.close();
		}
	}
}

