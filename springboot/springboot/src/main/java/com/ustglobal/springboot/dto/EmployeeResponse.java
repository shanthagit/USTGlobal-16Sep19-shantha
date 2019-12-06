package com.ustglobal.springboot.dto;

import java.util.List;

public class EmployeeResponse {
  private int statusCode;
  private String message;
  private String description;
  private List<Employee> employees;
  
public int getStatusCode() {
	return statusCode;
}
public void setStatusCode(int statusCode) {
	this.statusCode = statusCode;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getDescription() {
	return description;
}
public List<Employee> getEmployees() {
	return employees;
}
public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}
public void setDescription(String description) {
	this.description = description;
}

  
}
