package com.example.booksexam.models;

public class Books {
	
	int book_id;
	String title;
	String author;
	int publication_year;
	int publisher_id;
	
	//setters and getters
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
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
	public int getPublication_year() {
		return publication_year;
	}
	public void setPublication_year(int publication_year) {
		this.publication_year = publication_year;
	}
	public int getPublisher_id() {
		return publisher_id;
	}
	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}
	//to string
	
	@Override
	public String toString() {
		return "Books [book_id=" + book_id + ", title=" + title + ", author=" + author + ", publication_year="
				+ publication_year + ", publisher_id=" + publisher_id + "]";
	}
	
	

}

