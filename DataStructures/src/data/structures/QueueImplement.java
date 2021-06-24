package data.structures;

class Queue
{
	static SinglyLinkedListNode front = null;
	static SinglyLinkedListNode tail = null;
	
	public void enqueue(SinglyLinkedListNode node)
	{
		if(front==null)
		{
			front=node;
			tail=front;
			System.out.println("queue :"+front);
		}
		else
		{
			tail.next=node;
			tail=node;
			System.out.println("queue :"+tail);
		}
	}
	
	public void dequeue()
	{
		if(front==null)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			System.out.println("dequeue :"+front);
			front=front.next;
			
		}
	}
	public void display()
	{
		SinglyLinkedListNode temp = front;
		
		while(temp!=null)
		{
			System.out.println(temp);
			temp=temp.next;
		}
	}
}

public class QueueImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue que = new Queue();
		que.enqueue(new SinglyLinkedListNode());
		que.enqueue(new SinglyLinkedListNode());
		que.enqueue(new SinglyLinkedListNode());
		que.enqueue(new SinglyLinkedListNode());
		que.enqueue(new SinglyLinkedListNode());
		que.enqueue(new SinglyLinkedListNode());
		que.display();
		que.dequeue();
		que.dequeue();
		que.dequeue();
		que.display();
	}

}
