package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.Dog;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

@Configuration
public class PetConfigurationClass {
    
	@Bean(name = "hello")
	//@Scope("prototype")    // gives the diff hexadecimal value
	public Hello getHello() {
		Hello hello = new Hello();   // singelton 
		hello.setMsg("I Love India");
		return hello;
	}
	
	// another task 
	@Bean(name = "dog")
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean(name = "cat")
	public Cat getCat() {
		return new Cat();     // we can have multiple methods
	}
	
	@Bean(name = "pet")  //we can use autowire inside(name , autowire ="byName" or "byType")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Bittu");
		pet.setAnimal(getDog());   // wiring the dog it calls the getDog() it returns the same obj 
		return pet;
 	}
}
