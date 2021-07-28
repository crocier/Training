package com.pos;

import java.sql.*;
public class DBConnect {
	
	private static Connection connection;
	
		static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		}
		
		public static Connection getConnection() {
			String url = "jdbc:mysql://localhost:3306/pos";
			String user = "root";
			String pass = "Croci@315";
			try {
				connection = DriverManager.getConnection(url, user, pass);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return connection;
			
		}
		
		public static void closeConnection() {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
