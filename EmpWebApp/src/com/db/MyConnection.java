package com.db;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class MyConnection {
	public static Connection getConnection()
	{
		Connection con = null;
		String URL="jdbc:mysql://localhost:3306/empschema";
		String user="root";
		String password="chaitu097";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,user,password);
			System.out.println("Connection Established....");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return(con);
	}
	
}
