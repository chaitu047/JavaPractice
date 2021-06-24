package prcaticeCocubes;

import java.util.Scanner;

public class StrongNumber {

	public static int factorial(int n)
	{
		if(n==1)
		{
			return (1);
		}
		else
		{
			return(n*factorial(n-1));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int i = scan.nextInt();
		scan.close();
		int num = i;
		int sum = 0;
		while(num!=0)
		{
			int temp = num%10;
			sum+=factorial(temp);
			num=num/10;
		}
		if(i==sum)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("not a strong number");
		}
		
	}

}
