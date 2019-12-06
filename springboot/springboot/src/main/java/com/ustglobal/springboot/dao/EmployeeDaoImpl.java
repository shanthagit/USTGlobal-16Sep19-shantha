package com.ustglobal.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.ustglobal.springboot.dto.Employee;
//@Repository
public class EmployeeDaoImpl implements EmployeeDAO{
	//@PersistenceUnit
	private EntityManagerFactory factory;
	

	@Override
	public boolean addEmployee(Employee bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		}catch(Exception e){
		e.printStackTrace();
		return false;
		
		}
	
	}
	
	// end of addemployee

	@Override
	public boolean modifyEmployee(Employee bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Employee employee = manager.find(Employee.class, bean.getId());
		employee.setName(bean.getName());
		employee.setGender(bean.getGender());
		employee.setPassword(bean.getPassword());
		employee.setDoj(bean.getDoj());
		transaction.commit();
		return true;
	}
	//end of modifyemployee

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Employee bean = manager.find(Employee.class, id);
		if(bean!=null) {
			manager.remove(bean);
			transaction.commit();
			return true;
			
		} else {
			return false;
		}
	}
	//end of delete

	@Override
	public Employee getEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		Employee bean = manager.find(Employee.class, id);
		
		return bean;
	}

	@Override
	public List<Employee> getAllEmployee() {
		String jpql = " from Employee";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Employee> query = manager.createQuery(jpql, Employee.class);
		List<Employee> employee = query.getResultList();
		return employee;
	}

}
