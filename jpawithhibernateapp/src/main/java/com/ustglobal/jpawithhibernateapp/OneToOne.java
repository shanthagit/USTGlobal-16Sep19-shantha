package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetoone.EmployeeInfo;
import com.ustglobal.jpawithhibernateapp.onetoone.EmployeeOtherInfo;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class OneToOne {
	public static void main(String[] args) {
		EmployeeInfo e = new EmployeeInfo();
		e.setId(10);
		e.setName("Priya");
		e.setEmail("swathi@gmail.com");
		EmployeeOtherInfo o = new EmployeeOtherInfo();
		o.setEid(1);
		o.setPassword("Priya@123");
		o.setFname("Khandre");
		o.setInfo(e);
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction =entityManager.getTransaction();
			entityTransaction.begin();
			EmployeeInfo info  =entityManager.find(EmployeeInfo.class, 10);
		System.out.println(info.getOinfo().getEid());
			//entityManager.persist(o);
			System.out.println("record saved");
			entityTransaction.commit();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		entityManager.close();
	}

}
