package com.ustglobal.springboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.springboot.dto.Employee;
import com.ustglobal.springboot.dto.EmployeeResponse;
import com.ustglobal.springboot.service.EmployeeService;
@RestController
public class EmployeeController {
    @Autowired
	private EmployeeService service;
    
	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public  EmployeeResponse addEmployee(@RequestBody Employee bean) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.addEmployee(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data added to the db");
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data not to be added");
		}
		return response;
	} // end of addEmployee
	
	
	@PutMapping(path="/modify", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee(@RequestBody Employee bean ) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.modifyEmployee(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data added to the db");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data not to be added");
		}
		return response;
	}// end of modifyEmployee
	
	@DeleteMapping(path  = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE )   // only produces 
	public EmployeeResponse deleteEmployee(@PathVariable("id")int id) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.deleteEmployee(id)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data added to the db");
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data not to be added");
		}
		return response;
	}// end of deleteEmployee
	
	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE )
	public EmployeeResponse getEmployee(@RequestParam("id")int id) {
	EmployeeResponse response = new EmployeeResponse();
	Employee bean = service.getEmployee(id);
	 List<Employee> beans = service.getAllEmployee();
	if(bean!=null) {
		response.setStatusCode(201);
		response.setMessage("success");
		response.setDescription("Data added to the db");
		response.setEmployees(beans);
	} else {
		response.setStatusCode(401);
		response.setMessage("failure");
		response.setDescription("Data not to be added");
	}
	return response;
	
	}//end ofgetEmployee
	
	@GetMapping(path = "/get-all", produces = MediaType.APPLICATION_JSON_VALUE )
	public  EmployeeResponse  getAllEmployee(){
		EmployeeResponse response = new EmployeeResponse();
		
		 List<Employee> beans = service.getAllEmployee();
		if(!beans.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data added to the db");
			response.setEmployees(beans);
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data not to be added");
		}
		return response;
	}//end of getAllEmployee
	
	@GetMapping(path = "/exec", produces = MediaType.APPLICATION_JSON_VALUE )
	public void createException() {
		int i = 1/0;
	}
}
