package com.example.booksexam.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.booksexam.models.Publisher;

public class PublisherMapper implements RowMapper<Publisher> {

	@Override
	public Publisher mapRow(ResultSet rs, int rowNum) throws SQLException {
		//create an Publisher Object
		Publisher p = new Publisher();
		
		p.setPublisher_id(rs.getInt(1));
		p.setPublisher_name(rs.getString(2));
		p.setLocation(rs.getString(3));
		p.setEstablished_year(rs.getInt(4));
		
		return p;
	}

}
