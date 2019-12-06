package com.ustglobal.springboot.service;

import java.util.List;

import com.ustglobal.springboot.dto.Employee;

public interface EmployeeService {
	public boolean addEmployee(Employee bean);
    public boolean modifyEmployee(Employee bean);
    public boolean deleteEmployee(int id);
    public Employee getEmployee(int id);
    public List<Employee> getAllEmployee();
}
