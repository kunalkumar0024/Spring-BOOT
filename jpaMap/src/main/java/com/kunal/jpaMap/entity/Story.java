package com.kunal.jpaMap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="story")
public class Story {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int storyId;
	
	@Column(name = "story_name")
	private String storyName;
	 
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book1_id")
	//@JsonBackReference
	private Book1Entity book1;
	 
//	public Story() {
//		super();
//	}
//	@Override
//	public String toString() {
//		return "Story [storyId=" + storyId + ", storyName=" + storyName + ", book1=" + book1 + "]";
//	}
//	public Story(int storyId, String storyName, Book1 book1) {
//		super();
//		this.storyId = storyId;
//		this.storyName = storyName;
//		this.book1 = book1;
//	}
	public int getStoryId() {
		return storyId;
	}
	public void setStoryId(int storyId) {
		this.storyId = storyId;
	}
	public String getStoryName() {
		return storyName;
	}
	public void setStoryName(String storyName) {
		this.storyName = storyName;
	}
	public Book1Entity getBook() {
		return book1;
	}
	public void setBook(Book1Entity book) {
		this.book1 = book;
	}

}
