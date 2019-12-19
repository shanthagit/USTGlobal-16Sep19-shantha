package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytoone.EmployeeInfo1;
import com.ustglobal.jpawithhibernateapp.manytoone.Experience;
import com.ustglobal.jpawithhibernateapp.manytoone.Pencil;

public class ManyToOne {
	public static void main(String[] args) {
		EmployeeInfo1 pb = new EmployeeInfo1();
		pb.setId(3);
		pb.setName("apsara");
		pb.setEmail("apsara@gmail.com");


		Experience p = new Experience();
		p.setExpid(55);
		p.setCompnayName("infosys");
		p.setYear(1995);
		p.setInfo(pb);


		Experience p1 = new Experience();
		p1.setExpid(56);
		p1.setCompnayName("cap");
		p1.setYear(1996);
		p1.setInfo(pb);

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction =entityManager.getTransaction();
			entityTransaction.begin();
			
			 //Experience pbox =entityManager.find(Experience.class, 51);
			 //System.out.println(pbox.getInfo().getId());
			// System.out.println(pbox.getInfo().getEmail());
			 //System.out.println(pbox.getInfo().getName());
			
			entityManager.persist(p);
			entityManager.persist(p1);
			System.out.println("record saved");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		entityManager.close();


	}

}
