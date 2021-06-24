package javadb;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentschema","root","chaitu097");
		Statement stmt = connect.createStatement();
		/*String query = "insert into student values(25,'Hitchens','ASDF.@xyz.com',98.86,'A',21)";
		stmt.execute(query);
		*/
		String insertquery = "insert into student values(?,?,?,?,?,?)";
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		String name=scan.next();
		String email = scan.next();
		float percentage = scan.nextFloat();
		String grade = scan.next();
		int age = scan.nextInt();
		scan.close();
		PreparedStatement pstmt = connect.prepareStatement(insertquery);
		pstmt.setInt(1,id);
		pstmt.setString(2,name);
		pstmt.setString(3,email);
		pstmt.setFloat(4,percentage);
		pstmt.setString(5,grade);
		pstmt.setInt(6,age);
		pstmt.executeUpdate();
		String query = "select * from student";
		ResultSet result = stmt.executeQuery(query);
		while(result.next())
		{
			System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getFloat(4)+" "+result.getString(5)+" "+result.getInt(6));
		}
		result.close();
		stmt.close();
		connect.close();
		
	}

}
