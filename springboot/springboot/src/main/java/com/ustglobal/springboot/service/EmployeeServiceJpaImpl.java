package com.ustglobal.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springboot.dto.Employee;
import com.ustglobal.springboot.repo.EmployeeRepo;

@Service
public class EmployeeServiceJpaImpl implements EmployeeService{
    @Autowired
	private EmployeeRepo repo;
	
	@Override
	public boolean addEmployee(Employee bean) {
		repo.save(bean);
		return true;
	}

	@Override
	public boolean modifyEmployee(Employee bean) {
		repo.Update(bean.getName(), bean.getPassword(),bean.getGender(),bean.getDoj());
		return true;
	}

	@Override
	public boolean deleteEmployee(int id) {
		/*
		 * Employee bean = repo.findById(id).get();
		 *  repo.delete(bean);
		 *  
		 *  or
		 */
		  repo.deleteById(id);
		return true;
	}

	@Override
	public Employee getEmployee(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return repo.findAll();
	}

}
