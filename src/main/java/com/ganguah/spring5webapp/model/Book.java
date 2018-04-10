package com.ganguah.spring5webapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data    // Generate getters and setters for all fields
@AllArgsConstructor   // Generate a parametrized constructor for all fields
@NoArgsConstructor    // default constructor required by Hibernate
public class Book {

    private String title;
    private String isbn;
    private String publisher;

    Set<Author> authors = new HashSet<>();

    public Book(String title, String isbn, String publisher) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
    }

}
