
package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.EmployeeInfo1;
import com.ustglobal.jpawithhibernateapp.manytomany.Training_info;



public class ManyToMany { 
	public static void main(String[] args) {

		EmployeeInfo1 c = new EmployeeInfo1(); 
		c.setId(105); c.setName("Baby");c.setEmail("Baby@gmil.com");

		EmployeeInfo1 c1 = new EmployeeInfo1();
		c.setId(102); c.setName("kiran");c.setEmail("kiran@gmil.com");

		ArrayList<EmployeeInfo1> al = new ArrayList<EmployeeInfo1>();
		al.add(c);
		al.add(c1);

		Training_info s = new Training_info();
		s.setTid(1);
		s.setType("java");
		s.setEmp(al);

		EntityManagerFactory entityManagerFactory = null; 
		EntityManager entityManager= null; 
		try { entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(s);
		

		System.out.println("record saved");

		entityTransaction.commit();

		} catch (Exception e) {
			e.printStackTrace(); 
			entityManager.close();
		} 
	}
}
