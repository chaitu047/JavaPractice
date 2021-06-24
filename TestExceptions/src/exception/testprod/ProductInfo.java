package exception.testprod;

import java.util.*;

public class ProductInfo {

	static List<Product> list = new ArrayList<Product>();
	public static void insertProd(Product obj)
	{
		list.add(obj);
	}
	
	public static void validProducts(List<Product> li) throws InvalidProductException
	{
		Iterator<Product> iter = li.iterator();
		while(iter.hasNext())
		{
			Product p=iter.next();
			if(p.getWeight()<200.00)
			{
				try{
					throw new InvalidProductException("Invalid "+p);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
					iter.remove();
				}
			}
		}
	}
	
	public static void display(List<Product> li)
	{
		for(Product p:li)
		System.out.println(p);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertProd(new Product(1000,500));
		insertProd(new Product(10,50));
		insertProd(new Product(1500,750));
		insertProd(new Product(100,100));
		insertProd(new Product(1200,800));
		insertProd(new Product(1600,400));
		insertProd(new Product(160,550));
		insertProd(new Product(2000,100));
		insertProd(new Product(1080,108));
		insertProd(new Product(170,750));
		
		try{
			validProducts(list);
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		
		display(list);
	}

}
