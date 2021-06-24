package prcaticeCocubes;

import java.util.Scanner;

public class FibanocciSeriesOfRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		scan.close();
		if(num==1)
		{
			System.out.print(0+" ");
		}
		else if(num==2)
		{
			System.out.print(1+" ");
		}
		else
		{
			int a = 0, b = 1;
			System.out.print(a+" "+b+" ");
			for(int i=3;i<=num;i++)
			{
				int c=a+b;
				a=b;
				b=c;
				System.out.print(c+" ");
			}
		}
		
	}

}
