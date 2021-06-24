package data.structures;

import java.util.Scanner;

public class Node {
	static int i=0;
	int key=0;
	
	static Scanner scan = new Scanner(System.in);
	
	String name;
	
	Node()
	{
		key=++i;
		System.out.println("Enter linked list data");
		System.out.flush();
		name = scan.nextLine();
	}
	
	Node(int key)
	{
		this.key=key;
		System.out.println("Enter linked list data");
		System.out.flush();
		name = scan.nextLine();
	}
	
	Node prev=null;
	Node next=null;
	
	public String toString()
	{
		return(String.valueOf(key) + " " + name);
	}
}
