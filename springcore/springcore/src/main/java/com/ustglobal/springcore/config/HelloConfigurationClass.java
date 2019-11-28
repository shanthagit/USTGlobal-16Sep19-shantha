package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ustglobal.springcore.di.Hello;import com.ustglobal.springcore.di.Pet;

@Configuration
@Import(PetConfigurationClass.class)
public class HelloConfigurationClass {
    
	@Bean(name = "hello")
	//@Scope("prototype")    // gives the diff hexadecimal value
	public Hello getHello() {
		Hello hello = new Hello();   // singelton 
		hello.setMsg("I Love India");
		return hello;
	}
	
	}
