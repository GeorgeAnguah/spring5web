package com.ganguah.spring5webapp.repository;

import com.ganguah.spring5webapp.model.Book;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass=Book.class, idClass=Long.class)
public interface BookRepository {
}
