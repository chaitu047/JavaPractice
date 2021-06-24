package data.structures;

import java.util.Scanner;

public class DoublyLinkedListNode {

	static int i=0;
	int id=0;
	
	static Scanner scan = new Scanner(System.in);
	String name;
	
	DoublyLinkedListNode()
	{
		id=++i;
		System.out.println("Enter linked list data");
		System.out.flush();
		name = scan.nextLine();
	}
	
	DoublyLinkedListNode prev=null;
	DoublyLinkedListNode next=null;
	
	public String toString()
	{
		return(String.valueOf(id) + " " + name);
	}
}
