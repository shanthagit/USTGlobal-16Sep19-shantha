package com.ustglobal.springboot.controller;

import java.util.List;

import com.ustglobal.springboot.dto.EmployeeBean;

public class EmployeeResponse {
	private int statusCode;
	private String message;
	private String description;
	public List<EmployeeBean> employeeBean;
	
	public List<EmployeeBean> getEmployeeBean() {
		return employeeBean;
	}
	public void setEmployeeBean(List<EmployeeBean> employeeBean) {
		this.employeeBean = employeeBean;
	}
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
	public void setDescription(String description) {
		this.description = description;
	}
	

}
