package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.PetConfigurationClass;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class AnnotationComponentScanConfiguration {
   public static void main(String[] args) {
	   ApplicationContext context = new AnnotationConfigApplicationContext(PetConfigurationClass.class);
		
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("I love my frnds");
		System.out.println(hello.getMsg());
		
		Pet  pet = context.getBean(Pet.class);
		pet.setName("google");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound(); 
}
}
