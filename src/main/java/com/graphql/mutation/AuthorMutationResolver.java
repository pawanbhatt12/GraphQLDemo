package com.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphql.model.Author;
import com.graphql.repo.AuthorRepository;

@Component
public class AuthorMutationResolver implements GraphQLMutationResolver{

	@Autowired
	private AuthorRepository authorRepository;
	
	public Author createAuthor(Author author) {
		
		return authorRepository.save(author);
	}
}
