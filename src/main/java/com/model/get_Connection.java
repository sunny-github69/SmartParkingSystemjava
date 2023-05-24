package com.model;

import java.sql.*;

public class get_Connection {
	
	static Connection getdbConnection() {
		Connection conn = null;
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn = DriverManager.getConnection("jdbc:mysql://containers-us-west-80.railway.app:5445/railway", "root", "kbI2nkW3Tv3Azjoguwk5");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}

}
