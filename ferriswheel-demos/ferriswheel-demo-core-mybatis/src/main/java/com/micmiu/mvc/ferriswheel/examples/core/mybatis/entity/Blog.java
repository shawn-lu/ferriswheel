package com.micmiu.mvc.ferriswheel.examples.core.mybatis.entity;

import com.micmiu.mvc.ferriswheel.orm.mybatis.entity.IdLongEntity;

import java.util.Date;

/**
 * entity: Blog
 * User: <a href="http://micmiu.com">micmiu</a>
 */
public class Blog extends IdLongEntity {

	private String title;

	private String author;

	private String category;

	private String url;

	private Date publishDate;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
}
