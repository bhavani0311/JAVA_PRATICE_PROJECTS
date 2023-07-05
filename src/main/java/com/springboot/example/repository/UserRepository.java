package com.springboot.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.example.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
