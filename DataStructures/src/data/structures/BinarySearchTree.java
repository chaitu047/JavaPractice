package data.structures;

import java.util.Scanner;

public class BinarySearchTree {
	static Node root=null;
	
	public static Node deleteRec(Node node,int val)
	{
		if(node==null)
		{
			return(node);
		}
		if(node.key>val)
		{
			node.prev=deleteRec(node.prev,val);
		}
		else if(node.key<val)
		{
			node.next=deleteRec(node.next,val);
		}
		else
		{
			if(node.prev==null)
			{
				return(node.next);
			}
			else if(node.next==null)
			{
				return(node.prev);
			}
			
			node.key=minValue(node.next);
			
			node.next=deleteRec(node.next,node.key);
		}
		return(node);
	}
	
	public static int minValue(Node node)
	{
		int minval=node.key;
		while(node.prev!=null)
		{
			minval=node.prev.key;
			node=node.prev;
		}
		return(minval);
	}
	
	public static Node search(Node node,int val)
	{
		if(node==null || node.key==val)
		{
			return(node);
		}
		
		if(node.key>val)
		{
			return(search(node.prev,val));
		}
		return(search(node.next,val));
	}
	
	public static Node insertNode(Node root,int key)
	{
		Node newnode = new Node(key);
		if(root==null || root.key==key)
		{
			root=newnode;
		}
		if(root.key<key)
		{
			root.next=insertNode(root.next,key);
		}
		if(root.key>key)
		{
			root.prev=insertNode(root.prev,key);
		}
		return(root);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Key");
		root=insertNode(root,scan.nextInt());
		root=insertNode(root,scan.nextInt());
		root=insertNode(root,scan.nextInt());
		root=insertNode(root,scan.nextInt());
		root=insertNode(root,scan.nextInt());
		root=insertNode(root,scan.nextInt());
		root=insertNode(root,scan.nextInt());
		root=insertNode(root,scan.nextInt());
		BinaryTreeImplement.inorder(root);
		System.out.println("________________________________________");
		root=deleteRec(root,scan.nextInt());
		BinaryTreeImplement.inorder(root);
		System.out.println("________________________________________");
		root=deleteRec(root,scan.nextInt());
		BinaryTreeImplement.inorder(root);
		scan.close();

	}

}
