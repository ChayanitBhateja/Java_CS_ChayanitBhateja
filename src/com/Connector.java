package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	Connection con;
	public Connection connect() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql:localhost:3306/parkingDB","root","password");
		System.out.println("connection Established");
		return con;
	}
	
	public void close() throws SQLException {
		con.close();
	}

}
