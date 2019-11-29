package com.ustglobal.jpawithhibernet;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernet.manytomany.Course;
import com.ustglobal.jpawithhibernet.manytomany.Student;

public class TestMany {
   public static void main(String[] args) {
	  EntityManager entityManager = null;
		 EntityTransaction entityTransaction = null;
		 
		 Course c = new Course();
		   c.setCid(10);
		   c.setCname("Biology");
		   
		   Course c1 = new Course();
		   c1.setCid(20);
		   c1.setCname("Maths");
		   
		   ArrayList<Course> alCourses = new ArrayList<Course>();
		   alCourses.add(c);
		   alCourses.add(c1);
		   
		   Student s= new Student();
		   s.setId(1);
		   s.setName("ram");
		   s.setCourses(alCourses);
		   
		 try {
			 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
				 entityManager = entityManagerFactory.createEntityManager();
				 entityTransaction = entityManager.getTransaction();
				entityTransaction.begin();
				
				entityManager.persist(s);
			
				System.out.println("record saved");
				entityTransaction.commit();
		 }  catch(Exception e) {
				e.printStackTrace();
				entityTransaction.rollback();
			}
		    	entityManager.close();
}
}
