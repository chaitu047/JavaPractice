package data.structures;

class DoublyLinkedList
{
	static DoublyLinkedListNode head=null;
	static DoublyLinkedListNode tail=null;
	
	public void insertNode(DoublyLinkedListNode node)
	{
		if(head==null)
		{
			head=node;
			tail=head;
			System.out.println("node inserted :"+node);
		}
		else
		{
			tail.next=node;
			node.prev=tail;
			tail=node;
			System.out.println("node inserted :"+node);
			
		}
	}
	
	
	public void insertNodeAtFirst(DoublyLinkedListNode node)
	{
		if(head==null)
		{
			head=node;
			tail=head;
			System.out.println("node inserted at First :"+node);
		}
		else
		{
			node.next=head;
			head.prev=node;
			head=node;
			System.out.println("node inserted at First :"+node);
		}
		
	}
	
	public void insertNodeAtLast(DoublyLinkedListNode node)
	{
		if(tail==null && head==null)
		{
			head=node;
			tail=head;
			System.out.println("node inserted at Last :"+node);
		}
		else
		{
			tail.next=node;
			node.prev=tail;
			tail=node;
			System.out.println("node inserted at Last :"+node);
		}
	}
	
	public void insertNodeAtPos(DoublyLinkedListNode node,int pos)
	{
		int i=1;
		if(head==null)
		{
			head=node;
			tail=head;
			System.out.println("node inserted at First :"+node);
		}
		
		if(pos==0)
		{
			node.next=head;
			head.prev=node;
			node.prev=null;
			head=node;
			System.out.println("inserted at pos :"+pos+" "+head);
		}
		else
		{
			DoublyLinkedListNode temp=head.next;
			
			while(temp!=null)
			{
				if(pos==i)
				{
					node.prev=temp.prev;
					node.next=temp;
					temp.prev.next=node;
					temp.prev=node;
					System.out.println("node inserted at pos :"+pos+" "+node);
				}
				i++;
				temp=temp.next;
			}
		}
	}
	
	public void deleteNodeAtFirst()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			System.out.println("Node deleted at First :"+head);
			head=head.next;
			head.prev=null;
		}
	}
	
	public void deleteNodeAtLast()
	{
		if(tail==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			DoublyLinkedListNode temp=tail;
			tail=tail.prev;
			tail.next=null;
			System.out.println("Node deleted at Last:"+temp);
			
		}
	}
	
	public void deleteNodeAtPos(int pos)
	{
		int i=1;
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		
		if(pos==0)
		{
			System.out.println("deleted at pos : "+pos+" "+head);
			head=head.next;
			head.prev=null;
		}
		
		else
		{
			DoublyLinkedListNode temp=head.next;
			while(temp!=null)
			{
				if(pos==i)
				{
					DoublyLinkedListNode tv=temp;
					temp.next.prev=temp.prev;
					temp.prev.next=temp.next;
					System.out.println("node deleted at pos : "+tv);
				}
				i++;
				temp=temp.next;
				
			}
		}
		
	}
	
	public void traverse()
	{
		DoublyLinkedListNode temp=head;
		
		while(temp!=null)
		{
			System.out.println(" # "+temp);
			temp=temp.next;
		}
	}

}

public class DoublyLinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList sl = new DoublyLinkedList();
		sl.insertNode(new DoublyLinkedListNode());
		sl.insertNode(new DoublyLinkedListNode());
		sl.insertNodeAtFirst(new DoublyLinkedListNode());
		sl.insertNodeAtFirst(new DoublyLinkedListNode());
		sl.insertNodeAtPos(new DoublyLinkedListNode(), 2);
		sl.insertNodeAtLast(new DoublyLinkedListNode());
		sl.insertNodeAtLast(new DoublyLinkedListNode());
		DoublyLinkedListNode.scan.close();
		sl.traverse();
		sl.deleteNodeAtFirst();
		sl.deleteNodeAtPos(3);
		sl.deleteNodeAtLast();
		sl.traverse();
	}

}
