package com.bezkoder.spring.graphql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bezkoder.spring.graphql.model.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {

}
