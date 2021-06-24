package data.structures;

public class BinarySearchTreePreOrder {
	static int index=0;
	public static Node createTree(int[] pre,int ind,int low,int high,int size)
	{
		
		if(index>=size || low>high)
		{
			return(null);
		}
		
		Node root=new Node(pre[ind]);
		index=index+1;
		
		if(low==high)
		{
			return(root);
		}
		
		int i=low;
		while(pre[i]>pre[i+1])
		{
			i++;
		}
		
		root.prev=createTree(pre,index,index,i-1,size);
		root.next=createTree(pre,index,i,high,size);
		return(root);
	}
	
	public static void main(String args[])
	{
		int[] pre = {8,5,7,4,40,50,60};
		Node root = createTree(pre,index,0,pre.length-1,pre.length);
		BinaryTreeImplement.inorder(root);
	}
}
