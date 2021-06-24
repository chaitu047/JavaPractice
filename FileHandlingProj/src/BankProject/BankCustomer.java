package BankProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class BankCustomer {
	
	private String userId;
	private String name;
	private String password;
	private double balance;
	
	public void createUser(String name,String password,double balance) throws IOException
	{
		this.name=name;
		this.password=password;
		this.balance=balance;
	}
	
	public String getUserId() {
		return userId;
	}

	public String generateUserId() throws IOException
	{
		FileReader input = new FileReader("count_users.txt");
		BufferedReader in = new BufferedReader(input);
		int count = Integer.parseInt(in.readLine());
		Date date = new Date();
		String temp = String.format("%ty%tm%04d",date,date,count);
		in.close();
		input.close();
		updateUserCount(count);
		return(temp);
	}
	
	public BankCustomer() throws IOException {
		this.userId=generateUserId();
	}
	
	public BankCustomer(String name, String password, double balance) throws IOException {
		this();
		createUser(name,password,balance);
		createFile();
	}

	public void updateUserCount(int count) throws IOException
	{
		FileWriter output = new FileWriter("count_users.txt");
		BufferedWriter out = new BufferedWriter(output);
		out.flush();
		out.write(String.valueOf(++count));
		out.close();
		output.close();
		
	}
	
	public void createFile() throws IOException
	{
		FileWriter out = new FileWriter(userId+".txt");
		out.flush();
		out.write(password+"/"+balance);
		out.close();
	}
	
	
	
	@Override
	public String toString() {
		return "userId=" + userId + " name=" + name + " password=" + password + " balance=" + balance;
	}
}
