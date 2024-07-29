package com.bezkoder.spring.graphql.repository.mongodb;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.graphql.model.mongodb.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}