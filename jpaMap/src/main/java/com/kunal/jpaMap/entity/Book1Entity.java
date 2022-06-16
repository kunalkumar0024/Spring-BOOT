package com.kunal.jpaMap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="book1")
public class Book1Entity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int book1Id;
	
	@Column(name = "book_name")
	private String book1Name;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "book1")
    //@JsonManagedReference
	private Story story;
	
//	@Override
//	public String toString() {
//		return "Book1 [book1Id=" + book1Id + ", book1Name=" + book1Name + ", story=" + story + "]";
//	}
//	public Book1() {
//		super();
//	}
//	public Book1(int book1Id, String book1Name, Story story) {
//		super();
//		this.book1Id = book1Id;
//		this.book1Name = book1Name;
//		this.story = story;
//	}
	public int getBook1Id() {
		return book1Id;
	}
	public void setBook1Id(int book1Id) {
		this.book1Id = book1Id;
	}
	public String getBook1Name() {
		return book1Name;
	}
	public void setBook1Name(String book1Name) {
		this.book1Name = book1Name;
	}
	public Story getStory() {
		return story;
	}
	public void setStory(Story story) {
		this.story = story;
	}
	@Override
	public String toString() {
		return "Book1 [book1Id=" + book1Id + ", book1Name=" + book1Name + ", story=" + story + "]";
	}
	
}
