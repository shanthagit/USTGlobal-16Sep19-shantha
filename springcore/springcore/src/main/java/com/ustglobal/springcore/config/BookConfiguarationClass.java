package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore.di.Book;
@Configuration
public class BookConfiguarationClass {
	
    @Bean(name ="book")
	public  Book getBook() {
		Book book = new Book();
		book.setName("I to had a love story");
		return book;
	}
}
