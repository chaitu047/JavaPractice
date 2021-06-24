package data.structures;

import java.util.Scanner;

public class BinaryTreeImplement {

	static int i= 0;
	
	public static Node create(Scanner scan)
	{
		System.out.println("Enter -1 to not insert node"+(++i));
		if(scan.nextInt()==-1)
		{
			return(null);
		}
		System.out.println("Enter Key");
		Node newnode = new Node(scan.nextInt());
		System.out.println("left node");
		newnode.prev=create(scan);
		System.out.println("right node");
		newnode.next=create(scan);
		return(newnode);
	}
	
	public static void preorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.key);
		preorder(root.prev);
		preorder(root.next);
	}
	
	public static void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.prev);
		System.out.println(root.key);
		inorder(root.next);
	}
	
	public static void postorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		postorder(root.prev);
		postorder(root.next);
		System.out.println(root.key);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Node root = create(scan);
		scan.close();
		preorder(root);
		System.out.println("__________________________________________");
		inorder(root);
		System.out.println("__________________________________________");
		postorder(root);
	}

}
