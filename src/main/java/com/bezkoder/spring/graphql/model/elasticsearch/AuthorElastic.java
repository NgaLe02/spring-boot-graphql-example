package com.bezkoder.spring.graphql.model.elasticsearch;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "authors")
public class AuthorElastic {
	@Id
	private String id;
	private String name;
	private Integer age;

	public AuthorElastic() {
	}

	public AuthorElastic(String id) {
		this.id = id;
	}

	public AuthorElastic(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}