package data.structures;

class CircularLinkedListSL {
	static SinglyLinkedListNode head = null;
	static SinglyLinkedListNode tail = null;

	public void insertNodeAtFirst(SinglyLinkedListNode node) {
		if (head == null) {
			head = node;
			tail = head;
			node.next = head;
			System.out.println("node inserted at First :" + node);
		} else {
			node.next = head;
			head = node;
			tail.next=head;
			System.out.println("node inserted at First :" + node);
		}

	}

	public void insertNodeAtLast(SinglyLinkedListNode node) {
		if (head == null) {
			head = node;
			node.next = head;
			tail = node;
			System.out.println("node inserted at Last :" + node);
		}

		else {
			tail.next = node;
			node.next = head;
			tail = node;
			System.out.println("node inserted at Last :" + node);
		}
	}

	public void insertNodeAtPos(SinglyLinkedListNode node, int pos) {
		int i = 1;
		if (head == null) {
			head = node;
			node.next = head;
			tail = head;
			System.out.println("node inserted at First :" + node);
		}

		if (pos == 0) {
			node.next = head;
			tail.next = node;
			head = node;
			System.out.println("inserted at pos :" + pos + " " + head);
		} else {
			SinglyLinkedListNode temp = head.next;
			SinglyLinkedListNode slow = head;
			while (temp != head) {
				if (pos == i) {
					SinglyLinkedListNode last = slow;
					node.next = temp;
					last.next = node;
					System.out.println("node inserted at pos :" + pos + " " + node);
				}
				i++;
				temp = temp.next;
				slow = slow.next;
			}
		}
	}

	public void deleteNodeAtFirst() {
		if (head == null) {
			System.out.println("List is Empty");
		}
		if (head == tail) {
			System.out.println("Node deleted at First :" + head);
			head = null;
		} else {
			tail.next = head.next;
			System.out.println("Node deleted at First :" + head);
			head = head.next;
		}
	}

	public void deleteNodeAtLast() {
		if (head == null) {
			System.out.println("List is Empty");
		} else {
			if (head == tail) {
				System.out.println("Node deleted at Last:" + head);
				head = null;
			} else {
				SinglyLinkedListNode temp = head;
				while (temp.next != tail) {
					temp = temp.next;
				}
				temp.next = head;
				System.out.println("Node deleted at Last:" + tail);
				tail = temp;

			}
		}
	}

	public void deleteNodeAtPos(int pos) {
		int i = 1;
		if (head == null) {
			System.out.println("List is Empty");
		} else {
			if (pos == 0) {
				System.out.println("deleted at pos : " + pos + " " + head);
				if (head == tail) {
					head = null;
				}
				SinglyLinkedListNode temp = tail;
				temp.next = head.next;
				head = head.next;
			}

			else {
				SinglyLinkedListNode temp = head.next;
				SinglyLinkedListNode slow = head;
				while (temp != head) {
					if (pos == i) {
						slow.next = temp.next;
						System.out.println("node deleted at pos :" + pos + " " + temp);
					}
					i++;
					temp = temp.next;
					slow = slow.next;

				}
			}
		}

	}

	public void traverse() {
		if (head == null) {
			System.out.println("Empty list");
		} else {
			SinglyLinkedListNode temp = head.next;
			System.out.println(" # " + head);
			while (temp != head) {
				System.out.println(" # " + temp);
				temp = temp.next;
			}
		}
	}

}

public class CircularLinkedListImplementationSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedListSL sl = new CircularLinkedListSL();
		sl.insertNodeAtLast(new SinglyLinkedListNode());
		sl.insertNodeAtLast(new SinglyLinkedListNode());
		sl.insertNodeAtLast(new SinglyLinkedListNode());
		sl.insertNodeAtLast(new SinglyLinkedListNode());
		sl.insertNodeAtFirst(new SinglyLinkedListNode());
		sl.insertNodeAtFirst(new SinglyLinkedListNode());
		sl.insertNodeAtPos(new SinglyLinkedListNode(), 2);
		sl.insertNodeAtPos(new SinglyLinkedListNode(), 3);
		sl.insertNodeAtPos(new SinglyLinkedListNode(), 1);
		sl.traverse();
		sl.deleteNodeAtFirst();
		sl.deleteNodeAtPos(3);
		sl.deleteNodeAtLast();
		sl.deleteNodeAtLast();
		sl.deleteNodeAtLast();
		sl.traverse();

	}

}
