package javatpoint;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node() {
	}

	Node(int data) {
		this();
		this.data = data;
	}
}

class SingleLinkedList {

	static Node head = null;

	static Node tail = null;

	public static void insertNode(Node n) {
		if (head == null) {
			head = n;
			tail = n;
		} else {
			Node temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = n;
			tail = n;

		}
	}

	public static void traverse() {
		Node temp = head;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void reverse() {
		Node prev = null;
		Node curr = head;
		Node fast = null;

		while (curr != null) {
			fast = curr.next;
			curr.next = prev;
			prev = curr;
			curr = fast;
		}
		head = prev;
	}

	public static void deleteNodeAtFirst() {
		if (head == null) {
			System.out.println("Empty List");
		} else {
			head = head.next;
		}
	}

	public static void deleteAtPos(int pos) {
		Node slow = null, curr = head, adv = null;

		if (pos == 0) {
			deleteNodeAtFirst();
		} else {
			for (int i = 1; i <= pos && curr != null; i++) {
				slow = curr;
				curr = curr.next;
				adv = curr.next;
			}
			slow.next = adv;
		}
	}
	
	public static void deleteAtLast()
	{
		Node temp=head;
		
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next = null;
	}
	
	public static void insertNodeAtFirst(Node n)
	{
		if(head==null)
		{
			head=n;
		}
		else
		{
			n.next=head;
			head=n;
		}
	}
	
	public static void insertNodeAtPos(int pos,Node n)
	{
		if(pos==0)
		{
			insertNodeAtFirst(n);
		}
		else
		{
			Node slow=null,curr=head;
			
			for(int i=1; i<=pos && curr!=null; i++)
			{
				slow = curr;
				curr=curr.next;
			}
			n.next=curr;
			slow.next=n;
		}
	}
	
}

class CircularLinkedList{
	static Node head = null;
	
	public static void insertNode(Node n) {
		if (head == null) {
			head = n;
			n.next = head;
		} else {
			Node temp = head.next;
			Node slow = head;

			while (temp != head) {
				temp = temp.next;
				slow = slow.next;
			}

			slow.next = n;
			n.next=head;
		}
	}

	public static void traverse() {
		Node temp = head;
		System.out.println(head.data);
		temp=temp.next;
		while (temp != head) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void reverse(Node curr) {
		
		if(curr.next == head)
		{
			System.out.println(curr.data);
			return;
		}
		reverse(curr.next);
		System.out.println(curr.data);
	}

	public static void deleteNodeAtFirst() {
		if (head == null) {
			System.out.println("Empty List");
		} else {
			head = head.next;
		}
	}

	public static void deleteAtPos(int pos) {
		Node slow = null, curr = head, adv = null;

		if (pos == 0) {
			deleteNodeAtFirst();
		} else {
			for (int i = 1; i <= pos && curr != null; i++) {
				slow = curr;
				curr = curr.next;
				adv = curr.next;
			}
			slow.next = adv;
		}
	}
	
	public static void deleteAtLast()
	{
		Node temp=head;
		
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next = null;
	}
	
	public static void insertNodeAtFirst(Node n)
	{
		if(head==null)
		{
			head=n;
		}
		else
		{
			n.next=head;
			head=n;
		}
	}
	
	public static void insertNodeAtPos(int pos,Node n)
	{
		if(pos==0)
		{
			insertNodeAtFirst(n);
		}
		else
		{
			Node slow=null,curr=head;
			
			for(int i=1; i<=pos && curr!=null; i++)
			{
				slow = curr;
				curr=curr.next;
			}
			n.next=curr;
			slow.next=n;
		}
	}
	
	
}

class TreeNode{
	int data;
	
	TreeNode left = null,right=null;
	
	TreeNode(int data)
	{
		this.data=data;
	}
}

class BinaryTree {

	static TreeNode root = null;
	static Scanner scan = new Scanner(System.in);
	
	public static TreeNode create()
	{
		int x = scan.nextInt();
		if(x!=-1)
		{
			int data = scan.nextInt();
			return(new TreeNode(data));
		}
		return root;
	}
	
}


public class DataStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		SingleLinkedList sll = new SingleLinkedList();
		sll.insertNode(new Node(0));
		sll.insertNode(new Node(1));
		sll.insertNode(new Node(2));
		sll.insertNode(new Node(3));
		sll.insertNode(new Node(4));
		sll.insertNode(new Node(5));
		// sll.reverse();
		sll.traverse();
		System.out.println("_________________________________________________");
		// sll.deleteNodeAtFirst();
		//sll.deleteAtPos(0);
		//sll.deleteAtLast();
		//sll.deleteAtLast();
		sll.insertNodeAtPos(0, new Node(34));
		sll.traverse();
		*/
		CircularLinkedList cll = new CircularLinkedList();
		cll.insertNode(new Node(0));
		cll.insertNode(new Node(1));
		cll.insertNode(new Node(2));
		cll.insertNode(new Node(3));
		cll.insertNode(new Node(4));
		cll.insertNode(new Node(5));
		//cll.traverse();
		cll.reverse(cll.head);
		//cll.traverse();
		
	}

}