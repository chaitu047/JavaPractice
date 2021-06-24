package data.structures;

import java.util.Scanner;

public class SinglyLinkedListNode
{
	static int i=0;
	static Scanner scan = new Scanner(System.in);
	
	int id=0;
	
	String name;
	
	SinglyLinkedListNode()
	{
		id=++i;
		System.out.println("Enter linked list data");
		System.out.flush();
		name = scan.nextLine();
	}
	
	SinglyLinkedListNode next = null;
	
	public String toString()
	{
		return(String.valueOf(id)+" "+name);
	}
	
}
