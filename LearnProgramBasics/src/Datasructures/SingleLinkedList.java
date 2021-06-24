package Datasructures;

import java.util.Scanner;

public class SingleLinkedList {
	
	static Node head=null;
	static Node tail=null;
	
	public static void insertNode(Node node)
	{
		Node temp=head;
		if(head==null)
		{
			head = node;
		}
		else
		{
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	
	public static void reverse()
	{
		Node prev = null;
		Node curr = head;
		Node next = null;
		
		while(curr!=null)
		{
			next = curr.next;
			curr.next = prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	
	public static void traverse()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Press 1 to insert Nodes");
		int a=0;
		while((a=scan.nextInt())==1)
		{
			System.out.println("Enter data to node");
			insertNode(new Node(scan.nextInt()));
			System.out.println("Enter 1 to insert new node 0 to stop");
		}
		scan.close();
		reverse();
		traverse();
	}

}
