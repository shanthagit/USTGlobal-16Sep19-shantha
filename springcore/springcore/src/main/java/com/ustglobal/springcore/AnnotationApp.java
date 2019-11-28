package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.PetConfigurationClass;
import com.ustglobal.springcore.di.Animal;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class AnnotationApp {
  public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(PetConfigurationClass.class);
	
	Hello hello = context.getBean(Hello.class);
	System.out.println(hello.getMsg());
	
	Hello hello2 = context.getBean(Hello.class);   //singelton obj
	System.out.println(hello2);
	System.out.println(hello);
	
	System.out.println("******************************");
	
//	Animal animal = context.getBean(Animal.class);  //Wiring concept   
//	animal.makeSound();   
	//it will give UnsatisfiedDependencyException if v comment bcoz we usedautowired in confgurationcalss so we must use @Qualifier
	
	Pet  pet = context.getBean(Pet.class);
	System.out.println(pet.getName());
	pet.getAnimal().makeSound();  // calling the Pet name
}
}
