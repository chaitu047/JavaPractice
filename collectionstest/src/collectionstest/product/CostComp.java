package collectionstest.product;

import java.util.*;

public class CostComp implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		if(p1.getId()<p2.getId())
		{
			return(1);
		}
		if(p1.getId()>p2.getId())
		{
			return(-1);
		}
		return 0;
	}
	
}
