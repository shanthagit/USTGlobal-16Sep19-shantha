package com.ustglobal.springboot.repo;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.ustglobal.springboot.dto.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	@Transactional    // springboot automatically 
	@Modifying
	@Query("Update Employee set name=:name, password=:password, gender=:gender, doj=:doj ")
	public void Update(String name, String password, String gender, Date doj);
	
	public Employee findByName(String name);
	
	public void deleteByName(String name);
}
