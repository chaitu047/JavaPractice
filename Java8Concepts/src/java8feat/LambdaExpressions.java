package java8feat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

interface Addable {
	
	void add(int a,int b);
	
}

interface AddStrings {
	
	void mergeStr(String a,String b);
	
}

interface MulNum {
	
	int mulNum(int a,int b);
	
}

interface StringReverse {
	String addStr(String s);
}

class Product {
	
	int id;
	String name;
	float price;
	
	public Product() {}
	
	public Product(int id, String name, float price)
	{
		this();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", price=" + price;
	}
	
}

public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a");
		int a = scan.nextInt();
		System.out.println("Enter b");
		int b = scan.nextInt();
		scan.close();
		Addable ad = (int c,int d)->{
			System.out.println(a+b);
		};
		
		AddStrings adstr = (String s1, String s2) -> {
			System.out.println(s1+s2);
		};
		
		MulNum mul = (int c, int d)->{
			return (c*d);
		};
		
		StringReverse strrev = (String s)->{
			return (new StringBuilder(s).reverse().toString());
		};
		
		ad.add(a, b);
		adstr.mergeStr("Chaitanya", "KLK");
		System.out.println(mul.mulNum(a, b));
		System.out.println(strrev.addStr("chaitanya"));
		
		
		List<Product> prodlist = new ArrayList<Product>();
		
		prodlist.add(new Product(1,"chaitanya",2500f));
		prodlist.add(new Product(2,"krishna",2700f));
		prodlist.add(new Product(3,"charishma",3500f));
		prodlist.add(new Product(4,"sampath",3600f));
		
		Stream<Product> prodstream = prodlist.stream().filter(p -> p.price > 2000);
		
		prodstream.forEach(product -> System.out.println("ID"+" :"+product.id+", "+"NAME :"+product.name+", "+"PRICE :"+product.price));
		
		Collections.sort(prodlist,(Product p1,Product p2)->{
			return p1.name.compareTo(p2.name);
		});
		
		System.out.print("\n\n\n\n\n");
		
		prodlist.forEach((l)->{System.out.println("ID"+" :"+l.id+", "+"NAME :"+l.name+", "+"PRICE :"+l.price);});
		
	}

}
