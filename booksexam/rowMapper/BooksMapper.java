package com.example.booksexam.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.booksexam.models.Books;

public class BooksMapper implements RowMapper<Books> {

	@Override
	public Books mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		//creating an object of books
		
		Books b = new Books();
		b.setBook_id(rs.getInt(1));
		b.setTitle(rs.getString(2));
		b.setAuthor(rs.getString(3));
		b.setPublication_year(rs.getInt(4));
		b.setPublisher_id(rs.getInt(5));
		
		return b;
	}

}
