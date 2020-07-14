package com.graphql.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Author")
public class Author {

	@Id
	private String id;
	
	private String name;
	
	private String description;
	
	private List<Book> books;
}
