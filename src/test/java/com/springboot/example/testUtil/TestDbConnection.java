package com.springboot.example.testUtil;

import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.springboot.example.util.DbConnection;

public class TestDbConnection {
	
	private DbConnection dbc;
	private Connection con;
	
	@BeforeEach
	public void initData() {
		dbc = new DbConnection();
	}
	
	@Test
	public void testGetCon() {
		 //con = dbc.getCon();
		//expect that value cant be null
		Assertions.assertDoesNotThrow(()->{con=dbc.getCon();});
		Assertions.assertNotNull(con,"connection is not created");
	}
	@AfterEach
	public void clean() {
		dbc = null;
		con = null;
	}
}
