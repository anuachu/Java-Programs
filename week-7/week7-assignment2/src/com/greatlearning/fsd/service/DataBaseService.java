package com.greatlearning.fsd.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Set;

import com.greatlearning.fsd.exception.invalidexception.*;
import com.greatlearning.model.tweet.*;
import com.greatlearning.model.user.*;

public class DataBaseService implements UserService,AutoCloseable {
	private Connection connection;
	
	public DataBaseService() {
		IntializeDataBase();
		
	}

	private void IntializeDataBase() {
		Optional<Connection> optionalConnection;
		try {
			optionalConnection = JDBC.getConnection();
			if(optionalConnection.isPresent());{
			connection = optionalConnection.get();
			}
		}catch(SQLException e) {
				System.out.println("Connection error!!!");
				e.printStackTrace();
			}
		}
	
	
	
	
	




	
}