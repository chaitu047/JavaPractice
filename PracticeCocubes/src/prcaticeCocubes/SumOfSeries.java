package prcaticeCocubes;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter range");
		int range = scan.nextInt();
		scan.close();
		int sum=0;
		System.out.print("Sum of n natural numbers :");
		
		for(int i=1;i<=range;i++)
		{
			sum += i;
		}
		System.out.println(sum);
		
		System.out.print("Sum of squares of n natural numbers :");
		
		sum = 0;
		for(int i=1;i<=range;i++)
		{
			sum += i*i; 
		}
		
		System.out.println(sum);
		
		System.out.print("Sum of cubes of n natural numbers :");
		
		sum = 0;
		for(int i=1;i<=range;i++)
		{
			sum += i*i*i; 
		}
		
		System.out.println(sum);
		
		System.out.println("Sum of series of A.P");
		
		
	}

}
