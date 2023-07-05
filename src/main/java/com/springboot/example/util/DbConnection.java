package com.springboot.example.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	public Connection getCon() {
		Connection con =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
