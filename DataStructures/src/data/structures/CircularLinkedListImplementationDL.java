package data.structures;

class CircularLinkedListDL {
	static DoublyLinkedListNode head = null;
	static DoublyLinkedListNode head1,head2;
	static DoublyLinkedListNode copy=null;
	public DoublyLinkedListNode copyList(DoublyLinkedListNode head)
	{
		DoublyLinkedListNode temp=head;
		while(temp!=null)
		{
		DoublyLinkedListNode node = new DoublyLinkedListNode();
		node=temp;
		if(copy==null)
		{
			copy=node;
		}
		
		temp=temp.next;
		}
		return(copy);
	}
	public void insertNodeAtFirst(DoublyLinkedListNode node) {
		if (head == null) {
			head = node;
			node.next = head;
			node.prev = head;
			System.out.println("node inserted at First :" + node);
		} else {
			DoublyLinkedListNode temp = head.prev;
			node.next = head;
			temp.next = node;
			node.prev = temp;
			head.prev = node;
			head = node;
			System.out.println("node inserted at First :" + node);
		}

	}

	public void insertNodeAtLast(DoublyLinkedListNode node) {
		if (head == null) {
			head = node;
			node.next = head;
			node.prev = head;
			System.out.println("node inserted at Last :" + node);
		}

		else {
			DoublyLinkedListNode temp = head.prev;
			temp.next = node;
			node.prev = temp;
			node.next = head;
			head.prev = node;
			System.out.println("node inserted at Last :" + node);
		}
	}

	public void insertNodeAtPos(DoublyLinkedListNode node, int pos) {
		int i = 1;
		if (head == null) {
			head = node;
			node.next = head;
			node.prev = head;
			System.out.println("node inserted at First :" + node);
		}

		if (pos == 0) {
			DoublyLinkedListNode temp = head.prev;
			node.next = head;
			temp.next = node;
			node.prev = temp;
			head.prev = node;
			head = node;
			System.out.println("inserted at pos :" + pos + " " + head);
		} else {
			DoublyLinkedListNode temp = head.next;

			while (temp != head) {
				if (pos == i) {
					DoublyLinkedListNode last = temp.prev;
					last.next = node;
					node.prev = last;
					node.next = temp;
					temp.prev = node;
					System.out.println("node inserted at pos :" + pos + " " + node);
				}
				i++;
				temp = temp.next;
			}
		}
	}

	public void deleteNodeAtFirst() {
		if (head == null) {
			System.out.println("List is Empty");
		}
		if (head.next == head) {
			System.out.println("Node deleted at First :" + head);
			head = null;
		} else {
			DoublyLinkedListNode temp = head.prev;
			temp.next = head.next;
			head.next.prev = temp;
			System.out.println("Node deleted at First :" + head);
			head = head.next;
		}
	}

	public void deleteNodeAtLast() {
		if (head == null) {
			System.out.println("List is Empty");
		} else {
			if (head.next == head) {
				System.out.println("Node deleted at Last:" + head);
				head = null;
			} else {
				DoublyLinkedListNode temp = head.prev;
				head.prev = temp.prev;
				temp.prev.next = head;
				System.out.println("Node deleted at Last:" + temp);

			}
		}
	}

	public void deleteNodeAtPos(int pos) {
		int i = 1;
		if (head == null) {
			System.out.println("List is Empty");
		} 
		else {
			if (pos == 0) {
				System.out.println("deleted at pos : " + pos + " " + head);
				if (head.next == head) {
					head = null;
				}
				DoublyLinkedListNode temp = head.prev;
				temp.next = head.next;
				head.next.prev = temp;
				head = head.next;
			}

			else {
				DoublyLinkedListNode temp = head.next;
				while (temp != head) {
					if (pos == i) {
						temp.prev.next=temp.next;
						temp.next.prev=temp.prev;
						System.out.println("node deleted at pos :" + pos + " " + temp);
					}
					i++;
					temp = temp.next;

				}
			}
		}

	}

	public void traverse(DoublyLinkedListNode head) {
		if (head == null) {
			System.out.println("Empty list");
		} else {
			DoublyLinkedListNode temp = head.next;
			System.out.println(" # " + head);
			while (temp != head) {
				System.out.println(" # " + temp);
				temp = temp.next;
			}
		}
	}
	
	public void splitList(DoublyLinkedListNode head)
	{
		DoublyLinkedListNode slowptr=head;
		DoublyLinkedListNode fastptr=head;
		while(fastptr.next!=head && fastptr.next.next!=head)
		{
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;
		}
		if(fastptr.next!=head)
		{
			fastptr=fastptr.next;
		}
		head1=head;
		head2=slowptr.next;
		slowptr.next=head1;
		head1.prev=slowptr;
		fastptr.next=head2;
		head2.prev=fastptr;
		traverse(head1);
		System.out.print("-------------------------------------------------------------------\n");
		traverse(head2);
	}

}

public class CircularLinkedListImplementationDL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedListDL sl = new CircularLinkedListDL();
		sl.insertNodeAtLast(new DoublyLinkedListNode());
		sl.insertNodeAtLast(new DoublyLinkedListNode());
		sl.insertNodeAtLast(new DoublyLinkedListNode());
		sl.insertNodeAtLast(new DoublyLinkedListNode());
		sl.insertNodeAtFirst(new DoublyLinkedListNode());
		sl.insertNodeAtFirst(new DoublyLinkedListNode());
		sl.insertNodeAtPos(new DoublyLinkedListNode(), 2);
		sl.insertNodeAtPos(new DoublyLinkedListNode(), 3);
		sl.insertNodeAtPos(new DoublyLinkedListNode(), 1);
		sl.traverse(CircularLinkedListDL.head);
		/*sl.deleteNodeAtFirst();
		sl.deleteNodeAtPos(3);
		sl.deleteNodeAtLast();
		sl.deleteNodeAtLast();
		sl.deleteNodeAtLast();*/
		System.out.print("-------------------------------------------------------------------\n");
		sl.splitList(CircularLinkedListDL.head);
		CircularLinkedListDL.copy = sl.copyList(CircularLinkedListDL.head);
		System.out.print("-------------------------------------------------------------------\n");
		sl.traverse(CircularLinkedListDL.copy);
	}

}
