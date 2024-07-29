package com.bezkoder.spring.graphql.repository.mongodb;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.graphql.model.mongodb.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
