package com.nitro.news.entity;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name="category")
public class CategoryEntity extends BaseEntity {
	
	@Column(name = "code")
	private String code;
	
	@Column
	private String name;
	
	@OneToMany(mappedBy = "category")
	private List<NewsEntity> news = new ArrayList<>();
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<NewsEntity> getNews() {
		return news;
	}

	public void setNews(List<NewsEntity> news) {
		this.news = news;
	}
	
	
}
