package collectionstest.book;

import java.util.*;
public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("ABC","XYZ",200);
		Book b2 = new Book("DEF","GGU",300);
		Book b3 = new Book("HIJ","KLM",400);
		Book b4 = new Book("NOP","QRP",1000);
		Book b5 = new Book("STU","WXV",1500);
		
		HashSet<Book> hashset = new HashSet<Book>();
		hashset.add(b1);
		hashset.add(b2);
		hashset.add(b3);
		hashset.add(b4);
		hashset.add(b5);
		
		System.out.println("HashSet");
		
		for(Book b:hashset)
		{
			System.out.println(b);
		}
		
		System.out.println("______________________________________________________");
		
		TreeSet<Book> treeset = new TreeSet<Book>(new CompAuthor());
		treeset.addAll(hashset);
		
		System.out.println("TreeSet");
		
		Iterator<Book> iter = treeset.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		System.out.println("______________________________________________________");
		
		LinkedHashSet<Book> linkedhashset = new LinkedHashSet<Book>();
		linkedhashset.addAll(treeset);
		
		System.out.println("LinkedHashSet");
		
		for(Book b:treeset)
		{
			System.out.println(b);
		}
		
		System.out.println("______________________________________________________");
		
		List<Book> list = new ArrayList<Book>();
		list.addAll(hashset);
		
		System.out.println("ArrayList");
		
		for(Book b:treeset)
		{
			System.out.println(b);
		}
		
		System.out.println("______________________________________________________");
		
		List<Book> linkedlist = new LinkedList<Book>();
		linkedlist.addAll(treeset);
		
		System.out.println("LinkedList");
		
		Collections.sort(linkedlist,new CompAuthor());
		
		for(Book b:linkedlist)
		{
			System.out.println(b);
		}
		
		System.out.println("______________________________________________________");
		
		Collections.sort(linkedlist,new CompCost());
		
		Iterator<Book> iterlist = linkedlist.iterator();
		
		System.out.println("LinkedList Iter");
		
		while(iterlist.hasNext())
		{
			if(iterlist.next().getId()==5)
				iterlist.remove();
		}
		
		System.out.println("______________________________________________________");
		
		Queue<Book> queue = new PriorityQueue<Book>();
		queue.addAll(linkedlist);
		
		for(Book b:queue)
		{
			System.out.println(b);
		}
	}

}