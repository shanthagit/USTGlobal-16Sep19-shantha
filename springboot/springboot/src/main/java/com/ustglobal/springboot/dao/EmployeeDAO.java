package com.ustglobal.springboot.dao;

import java.util.List;

import com.ustglobal.springboot.dto.Employee;

public interface EmployeeDAO {
    public boolean addEmployee(Employee bean);
    public boolean modifyEmployee(Employee bean);
    public boolean deleteEmployee(int id);
    public Employee getEmployee(int id);
    public List<Employee> getAllEmployee();
    
}
