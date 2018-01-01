package com.ganguah.spring5webapp.repository;

import com.ganguah.spring5webapp.model.Author;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass=Author.class , idClass=Long.class)
public interface AuthorRepository {
}
