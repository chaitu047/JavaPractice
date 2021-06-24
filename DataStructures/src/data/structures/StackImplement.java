package data.structures;

class Stack
{
	static SinglyLinkedListNode head = null;
	
	public void push(SinglyLinkedListNode node)
	{
			if(head==null)
			{
				head=node;
				System.out.println("push :"+node);
			}
			else
			{
				node.next=head;
				head=node;
				System.out.println("push :"+node);
			}
			
	}
	
	public void pop()
	{
			if(head==null)
			{
				
				System.out.println("Stack is Empty");
			}
			else
			{
				System.out.println("pop :"+head);
				head=head.next;
			}
	}
	public void display()
	{
		SinglyLinkedListNode temp=head;
		
		while(temp!=null)
		{
			System.out.println(temp);
			temp=temp.next;
		}
	}
	
}


public class StackImplement {

	public static void main(String args[])
	{
		Stack s1 = new Stack();
		s1.push(new SinglyLinkedListNode());
		s1.push(new SinglyLinkedListNode());
		s1.push(new SinglyLinkedListNode());
		s1.push(new SinglyLinkedListNode());
		s1.push(new SinglyLinkedListNode());
		s1.display();
		s1.pop();
		s1.pop();
		s1.display();
	}

}
