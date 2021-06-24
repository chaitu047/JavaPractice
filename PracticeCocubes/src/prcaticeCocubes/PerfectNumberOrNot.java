package prcaticeCocubes;

import java.util.Scanner;

public class PerfectNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		scan.close();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		
		if(sum==n)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("not a perfect number");
		}
	}

}
