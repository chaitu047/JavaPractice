package collectionstest.book;

import java.util.*;
import java.util.Map.Entry;

public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Book> hashmap = new HashMap<Integer,Book>();
		Book b1 = new Book("ABC","XYZ",200);
		Book b2 = new Book("DEF","QRP",300);
		Book b3 = new Book("HIJ","XYZ",400);
		Book b4 = new Book("NOP","QRP",1000);
		Book b5 = new Book("STU","XYZ",1500);
		
		hashmap.put(b1.getId(),b1);
		hashmap.put(b2.getId(),b2);
		hashmap.put(b3.getId(),b3);
		hashmap.put(b4.getId(),b4);
		hashmap.put(b5.getId(),b5);
		
		TreeMap<Integer,Book> publishmap = new TreeMap<Integer,Book>();
		
		//System.out.println(hashmap);
		
		for(Entry<Integer, Book> mapentry : hashmap.entrySet())
		{
			Book b = mapentry.getValue();
			int count = 0;
			for(Entry<Integer, Book> pubentry : hashmap.entrySet())
			{
				Book c = pubentry.getValue();
				if(b.getPublisher()==c.getPublisher())
				{
					count++;
				}
			}
			if(count>=2)
			{
				publishmap.put(b.getId(),b);
			}
		}
		
		System.out.println(publishmap);
	}

}
