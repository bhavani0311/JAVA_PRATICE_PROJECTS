package com.springboot.example.service;

import com.springboot.example.model.Book;

public interface IBookService {
	
	public void saveBook(Book book);
	
	public Double getAvg();
	
}
