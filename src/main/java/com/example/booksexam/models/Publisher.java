package com.example.booksexam.models;

public class Publisher {
	int publisher_id;
	String publisher_name;
	String location;
	int established_year;
	
	//setters and getters
	
	public int getPublisher_id() {
		return publisher_id;
	}
	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}
	public String getPublisher_name() {
		return publisher_name;
	}
	public void setPublisher_name(String publisher_name) {
		this.publisher_name = publisher_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getEstablished_year() {
		return established_year;
	}
	public void setEstablished_year(int established_year) {
		this.established_year = established_year;
	}
	
	//to string
	
	@Override
	public String toString() {
		return "Publisher [publisher_id=" + publisher_id + ", publisher_name=" + publisher_name + ", location="
				+ location + ", established_year=" + established_year + "]";
	}
	
	
	

}
