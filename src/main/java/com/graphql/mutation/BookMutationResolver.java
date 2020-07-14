package com.graphql.mutation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphql.model.Author;
import com.graphql.model.Book;
import com.graphql.repo.AuthorRepository;
import com.graphql.repo.BookRepository;

import graphql.GraphQLException;

@Component
public class BookMutationResolver implements GraphQLMutationResolver{

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private AuthorRepository authorRepository;
	
	public Book createBook(Book book) {
		
		return bookRepository.save(book);
	}
	
	public Book addAuthor(String authorid, String isbn) {
		Optional<Author> author = authorRepository.findById(authorid);
		Optional<Book> book = bookRepository.findByIsbn(isbn);
		if(author.isPresent()
				&& book.isPresent()) {
			book.get().setAuthors(List.of(author.get()));
			bookRepository.save(book.get());
			return book.get();
		}
		throw new GraphQLException("Book and Author mapping not found");
	}
}
