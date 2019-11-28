package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Hello;

public class LifeCycle {
  public static void main(String[] args) {
	  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
	  // we have to use this bocz a interface cannot close the context so v r using the class
	Hello hello = context.getBean(Hello.class);
	System.out.println(hello.getMsg());
	context.close();
}
}
