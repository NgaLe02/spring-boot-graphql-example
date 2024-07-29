package com.bezkoder.spring.graphql.model.elasticsearch;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "tutorials")
public class TutorialElastic {
	@Id
	private String id;
	private String title;
	private String description;
	private String author_id;

	public TutorialElastic() {
	}

	public TutorialElastic(String title, String description, String author_id) {
		this.title = title;
		this.description = description;
		this.author_id = author_id;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthorId() {
		return author_id;
	}

	public void setAuthorId(String author_id) {
		this.author_id = author_id;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", author_id=" + author_id
				+ "]";
	}
}
