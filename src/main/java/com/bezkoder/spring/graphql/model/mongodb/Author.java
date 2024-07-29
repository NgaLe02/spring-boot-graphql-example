package com.bezkoder.spring.graphql.model.mongodb;

<<<<<<< Updated upstream:src/main/java/com/bezkoder/spring/graphql/model/Author.java
import jakarta.persistence.*;

@Entity
=======
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "authors")
>>>>>>> Stashed changes:src/main/java/com/bezkoder/spring/graphql/model/mongodb/Author.java
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "age")
	private Integer age;

	public Author() {
	}

	public Author(Long id) {
		this.id = id;
	}

	public Author(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public Long getId() {
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
