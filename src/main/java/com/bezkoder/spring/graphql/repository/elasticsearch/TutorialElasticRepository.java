package com.bezkoder.spring.graphql.repository.elasticsearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.bezkoder.spring.graphql.model.elasticsearch.TutorialElastic;

public interface TutorialElasticRepository extends ElasticsearchRepository<TutorialElastic, String> {
	
}
