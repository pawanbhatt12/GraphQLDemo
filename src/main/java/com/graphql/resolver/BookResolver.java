package com.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.model.Book;
import com.graphql.repo.BookRepository;

@Component
public class BookResolver implements GraphQLQueryResolver{

	@Autowired
	private BookRepository bookRepository;
	
	public Book getBook(String isbn) {
		
		return bookRepository.findByIsbn(isbn).get();
	}
}
