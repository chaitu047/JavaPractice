package collectionstest.book;

import java.util.*;

public class CompCost implements Comparator<Book> {
	
	public int compare(Book b1,Book b2)
	{
		if(b1.getCost()<b2.getCost())
		{
			return(1);
		}
		if(b1.getCost()>b2.getCost())
		{
			return(-1);
		}
		return(0);
	}
	
}
