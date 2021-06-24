package collectionstest.book;

import java.util.*;

public class CompAuthor implements Comparator<Book>{

	public int compare(Book b1, Book b2)
	{
		return(-1*b1.getAuthor().compareTo(b2.getAuthor()));
	}

}
