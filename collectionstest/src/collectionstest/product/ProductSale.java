package collectionstest.product;

import java.util.*;

public class ProductSale {
	
	Set<Product> prodset = new TreeSet<Product>(new CostComp());
	
	public void addProduct(Product product)
	{
		prodset.add(product);
	}
	
	public Set<Product> getProduct()
	{
		return(prodset);
	}
	
	public void remProdCost(float cost)
	{
		Iterator<Product> iter = prodset.iterator();
		while(iter.hasNext())
		{
			if(iter.next().getCost()==cost)
			{
				iter.remove();
			}
		}
	}
	
	public Set<Product> getDuplicateProds()
	{
		Set<Product> temp = new LinkedHashSet<Product>();
		
		for(Product p1 : prodset)
		{
			float cost=p1.getCost();
			int count=0;
			for(Product p2 : prodset)
			{
				if(cost==p2.getCost())
				{
					count++;
				}
			}
			if(count>=2)
			{
				temp.add(p1);
			}
		}
		
		return(temp);
	}
	
}
