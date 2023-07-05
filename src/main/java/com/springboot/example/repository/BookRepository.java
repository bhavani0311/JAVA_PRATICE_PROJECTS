package com.springboot.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.example.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}
