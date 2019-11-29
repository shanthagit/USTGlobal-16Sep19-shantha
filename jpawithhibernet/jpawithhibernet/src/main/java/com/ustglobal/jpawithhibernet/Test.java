package com.ustglobal.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernet.manytoone.Pencil;
import com.ustglobal.jpawithhibernet.manytoone.PencilBox;

public class Test {
	
public static void main(String[] args) {
     PencilBox pb = new  PencilBox();
     pb.setBid(1);
     pb.setBname("apsara");
     
     Pencil p = new Pencil();
     p.setPid(10);
     p.setColor("black");
     p.setPencilbox(pb);
     
     Pencil p1 = new Pencil();
     p1.setPid(11);
     p1.setColor("black");
     p1.setPencilbox(pb);
	 EntityManager entityManager = null;
	 EntityTransaction entityTransaction = null;
	 
	 try {
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			 entityManager = entityManagerFactory.createEntityManager();
			 entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
				//Pencil pbox= entityManager.find(Pencil.class, 10);
				//System.out.println(pbox.getPencilbox().getBid());
			entityManager.persist(p);
			entityManager.persist(p1);
			System.out.println("record saved");
			entityTransaction.commit();
	 }  catch(Exception e) {
			e.printStackTrace();
			
		}
	    	entityManager.close();
	 
}
}
