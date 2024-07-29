package com.bezkoder.spring.graphql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bezkoder.spring.graphql.model.Author;

public interface AuthorRepository extends MongoRepository<Author, String> {

}