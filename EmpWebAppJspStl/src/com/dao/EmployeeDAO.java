package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.MyConnection;
import com.dto.Employee;

public class EmployeeDAO {
	
	public Employee getEmployee(String loginid)
	{
		Employee emp = null;
		Connection con = MyConnection.getConnection();
		String query = "select * from empschema.Employee where loginId=?";
		PreparedStatement pstmt = null;
		ResultSet result = null;
		try
		{
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,loginid);
			result = pstmt.executeQuery();
			if(result.next())
			{
				int id = result.getInt(1);
				String name = result.getString(2);
				double salary = result.getDouble(3);
				String loginId = result.getString(4);
				String passwd = result.getString(5);
				emp = new Employee(id,name,salary,loginId,passwd);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				pstmt.close();
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return(emp);
	}
	
	public List<Employee> getEmployees()
	{
		Connection con = MyConnection.getConnection();
		List<Employee> list = new ArrayList<Employee>();
		String query = "select * from empschema.Employee";
		PreparedStatement pstmt = null;
		ResultSet result = null;
		try
		{
			pstmt = con.prepareStatement(query);
			result = pstmt.executeQuery();
			while(result.next())
			{
				Employee emp = new Employee();
				emp.setEmpId(result.getInt(1));
				emp.setEmpName(result.getString(2));
				emp.setEmpSalary(result.getDouble(3));
				emp.setLoginId(result.getString(4));
				emp.setPassword(result.getString(5));
				list.add(emp);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				pstmt.close();
				con.close();
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return(list);
	}
	
	public Employee getEmployee(String loginid,String password)
	{
		Employee emp = null;
		Connection con = MyConnection.getConnection();
		String query = "select * from empschema.Employee where loginId=? and password =?";
		PreparedStatement pstmt = null;
		ResultSet result = null;
		try
		{
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,loginid);
			pstmt.setString(2,password);
			result = pstmt.executeQuery();
			if(result.next())
			{
				int id = result.getInt(1);
				String name = result.getString(2);
				double salary = result.getDouble(3);
				String loginId = result.getString(4);
				String passwd = result.getString(5);
				emp = new Employee(id,name,salary,loginId,passwd);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				pstmt.close();
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return(emp);
	}
	
	public int register(Employee employee) {
		int result = 0;
		Connection con = null;
		String INSERT = "Insert into Employee Values (?,?,?,?,?)";
		PreparedStatement pst = null;
		
		try {
			con = MyConnection.getConnection();
			pst = con.prepareStatement(INSERT);
			pst.setInt(1, employee.getEmpId());
			pst.setString(2, employee.getEmpName());
			pst.setDouble(3, employee.getEmpSalary());
			pst.setString(4, employee.getLoginId());
			pst.setString(5, employee.getPassword());
			
			result = pst.executeUpdate();		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				pst.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	public Employee getEmployeeById(int empId) {
		Connection con = null;
		String SELECT = "Select * from Employee where empId=?";
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			con = MyConnection.getConnection();
			pst = con.prepareStatement(SELECT);
			pst.setInt(1, empId);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				//convert result set into employee object
				
				Employee employee = new Employee();
				
				employee.setEmpId(rs.getInt(1));
				employee.setEmpName(rs.getString(2));
				employee.setEmpSalary(rs.getDouble(3));
				employee.setLoginId(rs.getString(4));
				employee.setPassword(rs.getString(5));
				
				return employee;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				pst.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
		return null;
	}
	
	public Employee getEmployee(int empid)
	{
		Employee emp = null;
		Connection con = MyConnection.getConnection();
		String query = "select * from empschema.Employee where empId=?";
		PreparedStatement pstmt = null;
		ResultSet result = null;
		try
		{
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,empid);
			result = pstmt.executeQuery();
			if(result.next())
			{
				int id = result.getInt(1);
				String name = result.getString(2);
				double salary = result.getDouble(3);
				String loginId = result.getString(4);
				String passwd = result.getString(5);
				emp = new Employee(id,name,salary,loginId,passwd);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				pstmt.close();
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return(emp);
	}
	
	public int delete(int empId) {
		Connection con = null;
		String SELECT = "delete * from Employee where empId=?";
		
		PreparedStatement pst = null;
		int res=0;
		
		try {
			con = MyConnection.getConnection();
			pst = con.prepareStatement(SELECT);
			pst.setInt(1, empId);
			res = pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				pst.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return(res);
	}


}
