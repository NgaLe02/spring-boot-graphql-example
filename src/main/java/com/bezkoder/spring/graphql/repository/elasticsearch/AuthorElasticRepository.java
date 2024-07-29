package com.bezkoder.spring.graphql.repository.elasticsearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.bezkoder.spring.graphql.model.elasticsearch.AuthorElastic;

public interface AuthorElasticRepository extends ElasticsearchRepository<AuthorElastic, String> {
	
}
