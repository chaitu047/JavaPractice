package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.db.MyConnection;
import com.dto.Employee;

public class EmployeeDAO {

	public Employee getEmployee(String loginid, String password) {
		Connection con = null;
		String query = "select * from empschema.Employee where loginId=? and password =?";
		con = MyConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet res = null;
		try 
		{
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,loginid);
			pstmt.setString(2,password);
			res = pstmt.executeQuery();
			if(res.next())
			{
				Employee emp = new Employee();
				emp.setEmpId(res.getInt(1));
				emp.setEmpName(res.getString(2));
				emp.setEmpSalary(res.getDouble(3));
				emp.setLoginId(res.getString(4));
				emp.setPassword(res.getString(5));
				return emp;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public int register(Employee emp) 
	{
		Connection con = null;
		String query = "insert into empschema.Employee values(?,?,?,?,?)";
		con = MyConnection.getConnection();
		PreparedStatement pstmt = null;
		int res=0;
		try 
		{
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,emp.getEmpId());
			pstmt.setString(2,emp.getEmpName());
			pstmt.setDouble(3,emp.getEmpSalary());
			pstmt.setString(4,emp.getLoginId());
			pstmt.setString(5,emp.getPassword());
			res = pstmt.executeUpdate();
			if(res!=0)
			return(res);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return(0);
	}

	public ArrayList<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		Connection con = null;
		String query = "select * from empschema.Employee";
		ArrayList<Employee> list = new ArrayList<Employee>();
		con = MyConnection.getConnection();
		Statement stmt = null;
		ResultSet res = null;
		try 
		{
			stmt=con.createStatement();
			res = stmt.executeQuery(query);
			while(res.next())
			{
				Employee emp = new Employee();
				emp.setEmpId(res.getInt(1));
				emp.setEmpName(res.getString(2));
				emp.setEmpSalary(res.getDouble(3));
				emp.setLoginId(res.getString(4));
				emp.setPassword(res.getString(5));
				list.add(emp);
			}
			return(list);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public Employee getEmployee(String name) {
		Connection con = null;
		String query = "select * from empschema.Employee where empName=?";
		con = MyConnection.getConnection();
		PreparedStatement stmt = null;
		ResultSet res = null;
		try 
		{
			stmt=con.prepareStatement(query);
			stmt.setString(1, name);
			res = stmt.executeQuery();
			if(res.next())
			{
				Employee emp = new Employee();
				emp.setEmpId(res.getInt(1));
				emp.setEmpName(res.getString(2));
				emp.setEmpSalary(res.getDouble(3));
				emp.setLoginId(res.getString(4));
				emp.setPassword(res.getString(5));
				return emp;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public Employee getEmployeeLogin(String loginid) {
		Connection con = null;
		String query = "select * from empschema.Employee where loginId=?";
		con = MyConnection.getConnection();
		PreparedStatement stmt = null;
		ResultSet res = null;
		try 
		{
			stmt=con.prepareStatement(query);
			stmt.setString(1, loginid);
			res = stmt.executeQuery();
			if(res.next())
			{
				Employee emp = new Employee();
				emp.setEmpId(res.getInt(1));
				emp.setEmpName(res.getString(2));
				emp.setEmpSalary(res.getDouble(3));
				emp.setLoginId(res.getString(4));
				emp.setPassword(res.getString(5));
				return emp;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
