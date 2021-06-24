package javadb;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class DBEmployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentschema","root","chaitu097");
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(1,"Jack","New York",79895623,65000));
		emplist.add(new Employee(2,"Jhon","New Jersey",85693212,56000));
		emplist.add(new Employee(3,"Ronnie","San Andreas",65982314,66000));
		Statement stmt = connect.createStatement();
		String createquery = "create table Employee(id int primary key,name varchar(50),address text,phoneno long,basic_salary int)";
		stmt.execute(createquery);
		String insertquery = "insert into Employee values(?,?,?,?,?)";
		PreparedStatement pstmt = connect.prepareStatement(insertquery);
		int i=0;
		for(Employee e : emplist)
		{
			long empid=e.getId();
			String empname=e.getName();
			String empaddress = e.getAddress();
			long empphoneno=e.getPhoneno();
			double empsalary=e.getBasicSalary();
			
			pstmt.setLong(1,empid);
			pstmt.setString(2,empname);
			pstmt.setString(3,empaddress);
			pstmt.setLong(4,empphoneno);
			pstmt.setDouble(5,empsalary);
			
			i+=pstmt.executeUpdate();
		}
		String selectquery = "select * from Employee";
		System.out.println(i+" rows inserted");
		ResultSet result = stmt.executeQuery(selectquery);
		while(result.next())
		{
			System.out.println(result.getLong(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getLong(4)+" "+result.getDouble(5));
		}
		result.close();
		connect.close();
		stmt.close();
		pstmt.close();
	}

}
