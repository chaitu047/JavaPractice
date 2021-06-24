package javatutorial;

import java.util.Scanner;

public class DiscountAndSp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double price,sprice;
		System.out.println("Enter the price of item :");
		price = scan.nextDouble();
		scan.close();
		if(price<10000)
		{
			sprice = price*(0.90);
			
		}
		else if(price>10000 && price<20000)
		{
			sprice = price*(0.80);
		}
		else
		{
			sprice = price*(0.75);
		}
		System.out.println("Selling Price of item : "+sprice);
	}

}
