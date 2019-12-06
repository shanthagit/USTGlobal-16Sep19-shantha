package com.ustglobal.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springboot.dao.EmployeeDAO;
import com.ustglobal.springboot.dto.Employee;
//@Service
public class EmployeeServiceImpl implements EmployeeService{
	//@Autowired
   private EmployeeDAO dao;   
	
	@Override
	public boolean addEmployee(Employee bean) {
		if(bean.getName()==null||bean.getPassword()==null) {
			return false;
		} else if(bean.getPassword().length()<8) {
			return false;
		}
		return dao.addEmployee(bean);
	}

	@Override
	public boolean modifyEmployee(Employee bean) {
		
		if(bean.getName()==null||bean.getPassword()==null) {
			return false;
		} else if(bean.getPassword().length()<8) {
			return false;
		}
		return dao.modifyEmployee(bean);
	}

	@Override
	public boolean deleteEmployee(int id) {
		
		return dao.deleteEmployee(id);
	}

	@Override
	public Employee getEmployee(int id) {
		
		return dao.getEmployee(id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return dao.getAllEmployee();
	}

}
