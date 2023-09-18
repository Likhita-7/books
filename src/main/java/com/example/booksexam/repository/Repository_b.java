package com.example.booksexam.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.booksexam.dao.DaoImp;
import com.example.booksexam.models.Publisher;

@Repository
public class Repository_b {
	private final DaoImp dao;
	
	@Autowired
	public Repository_b(DaoImp dao) {
		this.dao=dao;
	}
	
	//to get all publishers
	public ArrayList<Publisher> getAllPublishers(){
		return (ArrayList<Publisher>) dao.getAllPublishers();
		
	}
	
	public void delPublisher(int id) {
		dao.delPublisher(id);
	}
	
	

}
