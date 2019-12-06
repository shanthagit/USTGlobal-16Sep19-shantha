package com.ustglobal.springboot.controller;

//import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.springboot.dto.EmployeeResponse;

//@ControllerAdvice     // it advice the controller if it present it must have @ResponseBody in the public method
@RestControllerAdvice
public class HandleException {
   
	@ExceptionHandler(Exception.class)    // Exception.class IS A GENERIC IT ACCEPTS ALL EXCEPTION
	public  EmployeeResponse getException() {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("error in code");
		response.setDescription("got an exception");
		return response;
	}
}
