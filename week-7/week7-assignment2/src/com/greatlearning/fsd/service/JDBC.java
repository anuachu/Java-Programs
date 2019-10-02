package com.greatlearning.fsd.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

public class JDBC {
	
	enum Operation{
		INSERT,QUERY,UPDATE,DELETE
	}
	
	private static Optional<Connection> OptionalConnection = Optional.ofNullable(null);
	
	private static final String URL = "jdbc:mysql://localhost:3306/twitter1_db";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "rootroot";
	
	public static Optional<Connection>getConnection()throws SQLException {
	if(OptionalConnection.isPresent() == false) {
		try {
			OptionalConnection = Optional.of(DriverManager.getConnection(URL,USERNAME,PASSWORD));
			
		}catch(SQLException e) {
			throw e;
		}
	}
	return OptionalConnection;
	}
	
	

}
