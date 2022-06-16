package com.kunal.jpaMap.entity;

public class Book1POJO {





		
		private int book1Id;
	
		private String book1Name;
		
		
		private Story story;
		
//		@Override
//		public String toString() {
//			return "Book1 [book1Id=" + book1Id + ", book1Name=" + book1Name + ", story=" + story + "]";
//		}
//		public Book1() {
//			super();
//		}
//		public Book1(int book1Id, String book1Name, Story story) {
//			super();
//			this.book1Id = book1Id;
//			this.book1Name = book1Name;
//			this.story = story;
//		}
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

