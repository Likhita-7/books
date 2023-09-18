package com.example.booksexam.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.booksexam.models.Publisher;
import com.example.booksexam.repository.Repository_b;

@RestController
public class Controller_b {
	private final Repository_b rep;
	
	@Autowired
	public Controller_b(Repository_b rep) {
		this.rep=rep;
	}
	
	@GetMapping(value="/publish")
	public ArrayList<Publisher> getAllPublishers(){
		return rep.getAllPublishers();
		
	}
	@RequestMapping(value="/publish/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id) {
		rep.delPublisher(id);
	}

}
