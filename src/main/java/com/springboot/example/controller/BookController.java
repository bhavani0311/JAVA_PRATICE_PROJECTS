package com.springboot.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.example.model.Book;
import com.springboot.example.service.IBookService;

@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	IBookService bookService;
	
	@PostMapping("/save")
	public void saveBook(@RequestBody Book book) {
		bookService.saveBook(book);
	}
	
	@GetMapping("/avg")
	public Double getAvg() {
		return bookService.getAvg();
	}

}
