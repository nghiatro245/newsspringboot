package com.nitro.news.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="new")
public class NewsEntity extends BaseEntity {
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "thumnail")
	private String thumnail;
	
	@Column(name = "shortdescription")
	private String shortDescription;
	
	@Column(name = "content")
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private CategoryEntity category;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumnail() {
		return thumnail;
	}

	public void setThumnail(String thumnail) {
		this.thumnail = thumnail;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}
	
	
}
