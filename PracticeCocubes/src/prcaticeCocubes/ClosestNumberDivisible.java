package prcaticeCocubes;

import java.util.Scanner;

public class ClosestNumberDivisible {

	public static void closestNumber(int n,int m)
	{
		int q=n/m;
		
		int n1 = m*q;
		
		int n2=((n*m)>0)?(m*(q+1)):(m*(q-1));
		
		if(Math.abs(n-n1)<Math.abs(n-n2))
		{
			System.out.println(n1);
		}
		else
		{
			System.out.println(n2);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scan.nextInt();
		System.out.println("Enter divisor");
		int divisor = scan.nextInt();
		scan.close();
		closestNumber(number,divisor);
	}

}
