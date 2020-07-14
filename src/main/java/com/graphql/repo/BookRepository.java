package com.graphql.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.graphql.model.Book;

public interface BookRepository extends MongoRepository<Book, String>{

	Optional<Book> findByIsbn(String isbn);
}
