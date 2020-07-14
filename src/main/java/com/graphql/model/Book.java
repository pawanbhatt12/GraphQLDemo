package com.graphql.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Book")
public class Book {

	@Id
	private String id;
	
	private String isbn;
	
	private String title;

	private List<Author> authors;
}
