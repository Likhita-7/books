package com.example.booksexam.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.booksexam.models.Publisher;
import com.example.booksexam.rowMapper.PublisherMapper;
@Component
public class DaoImp implements Dao {
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public DaoImp(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate= jdbcTemplate;
	}

	@Override
	public ArrayList<Publisher> getAllPublishers() {
		String sql="SELECT * FROM likhita_publishers";
				
		return (ArrayList<Publisher>) jdbcTemplate.query(sql, new PublisherMapper());
	}

	//to delete a publisher
	@Override
	public void delPublisher(int id) {
		
		String sql="DELETE FROM likhita_publishers WHERE  publisher_id=?";
		jdbcTemplate.update(sql,id);
	}

	

}
