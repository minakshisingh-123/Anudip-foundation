package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	
	@Entity
	@Table(name = "books")
	public class Book {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int bid;
	    
	    private String title;
	    private String author;
		public void setTitle(String string) {
			
		}
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getBid() {
			return bid;
		}
		public void setBid(int bid) {
			this.bid = bid;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getTitle() {
			return title;
		}
		@Override
		public String toString() {
			return "Book [bid=" + bid + ", title=" + title + ", author=" + author + "]";
		}
		

	}





