package data.structures;

class SingleLinkedList
{
	static SinglyLinkedListNode head=null;
	static SinglyLinkedListNode tail=null;
	
	public static void reverseLinkedList()
	{
		SinglyLinkedListNode prev = null;
		SinglyLinkedListNode curr = head;
		SinglyLinkedListNode next = null;
		
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
	}
	
	public void insertNode(SinglyLinkedListNode node)
	{
		if(head==null)
		{
			head=node;
			tail = head;
			System.out.println("node inserted :"+node);
		}
		else
		{
			tail.next = node;
			tail = node; 
			System.out.println("node inserted :"+node);
			
		}
	}
	
	
	public void insertNodeAtFirst(SinglyLinkedListNode node)
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
			head=node;
			System.out.println("node inserted at First :"+node);
		}
		
	}
	
	
	public void insertNodeAtLast(SinglyLinkedListNode node)
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
			tail=node;
			System.out.println("node inserted at Last :"+node);
		}
	}
	
	public void insertNodeAtPos(SinglyLinkedListNode node,int pos)
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
			head=node;
			System.out.println("inserted at pos :"+pos+" "+head);
		}
		else
		{
			SinglyLinkedListNode tempadv=head;
			SinglyLinkedListNode temp=tempadv.next;
			
			while(temp!=null)
			{
				if(pos==i)
				{
					tempadv.next=node;
					node.next=temp;
					System.out.println("node inserted at pos :"+pos+" "+node);
				}
				i++;
				tempadv=tempadv.next;
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
			SinglyLinkedListNode temp=head;
			while(temp.next!=tail)
			{
				temp=temp.next;
			}
			tail=temp;
			System.out.println("Node deleted at Last:"+temp.next);
			temp.next=null;
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
		}
		
		else
		{
			SinglyLinkedListNode tempadv=head;
			SinglyLinkedListNode temp=tempadv.next;
			while(temp!=null)
			{
				if(pos==i)
				{
					tempadv.next=temp.next;
					System.out.println("node deleted at pos :"+pos+" "+temp);
				}
				i++;
				tempadv=tempadv.next;
				temp=temp.next;
				
			}
		}
		
	}
	
	public void traverse()
	{
		SinglyLinkedListNode temp=head;
		
		while(temp!=null)
		{
			System.out.println(" # "+temp);
			temp=temp.next;
		}
	}
}
public class SingleLinkedListImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList sl = new SingleLinkedList();
		sl.insertNode(new SinglyLinkedListNode());
		sl.insertNode(new SinglyLinkedListNode());
		sl.insertNodeAtFirst(new SinglyLinkedListNode());
		sl.insertNodeAtFirst(new SinglyLinkedListNode());
		sl.insertNodeAtPos(new SinglyLinkedListNode(), 2);
		sl.insertNodeAtLast(new SinglyLinkedListNode());
		sl.insertNodeAtLast(new SinglyLinkedListNode());
		SinglyLinkedListNode.scan.close();
		sl.traverse();
		/*sl.deleteNodeAtFirst();
		sl.deleteNodeAtPos(2);
		sl.deleteNodeAtLast();
		sl.traverse();*/
	}

}
