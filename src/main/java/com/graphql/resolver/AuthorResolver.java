package com.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.model.Author;
import com.graphql.repo.AuthorRepository;

@Component
public class AuthorResolver implements GraphQLQueryResolver{

	@Autowired
	private AuthorRepository authorRepository;
	
	public Author getAuthor(String name) {
		
		return authorRepository.findByName(name);
	}
}
