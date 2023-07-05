package com.springboot.example.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.example.model.Book;
import com.springboot.example.repository.BookRepository;

@Service
public class BookServiceImpl implements IBookService{
	
	@Autowired
	BookRepository bookRepo;
	
	@Autowired
	DataSource datasource; 
	
	@Override
	public void saveBook(Book book) {
		
		 bookRepo.save(book);
		 
	}
	
	public Double getAvg() {
		
		Double avgPrice = null;
		
		try {
			Connection con = datasource.getConnection();
			Statement stmt = con.createStatement();
			String sql = "select avg(book_price) avg from book_table";
			ResultSet rst = stmt.executeQuery(sql);
			
			while(rst.next()) {
				avgPrice = rst.getDouble(1);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return avgPrice;
	}

}
