package com.graphql.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.graphql.model.Author;

public interface AuthorRepository extends MongoRepository<Author, String>{

	Author findByName(String name);
}
