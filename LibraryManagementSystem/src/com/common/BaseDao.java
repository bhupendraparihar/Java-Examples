package com.common;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class BaseDao {
	
	public static Connection createConnection() throws SQLException{
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
		}
		
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB","root", "password");
			
		//statement = connection.createStatement();
		
		return connection;
	}
}
