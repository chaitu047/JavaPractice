package javatutorial;

import java.util.Scanner;

public class PrintingFloyd {
	static int number(int i,int j)
	{
		if(i%2==0)
		{
			if(j%2==0)
			{
				return(1);
			}
			else
			{
				return(0);
			}
			
		}
		else
		{
			if(j%2==0)
			{
				return(0);
			}
			else
			{
				return(1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int k=scan.nextInt();
		scan.close();
		for(int i=1;i<=k;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(number(i,j));
			}
			System.out.println();
		}
		System.out.println();
		for(int m=1;m<=10;m+=2)
		{
			for(int l=1;l<m;l+=2)
			{
				System.out.print(" ");
			}
			for(int n=10-m;n>=1;n--)
			{
				System.out.print(number(m,n));
			}
			System.out.println();
		}
		for(int m=1;m<=10;m+=2)
		{
			for(int l=10-m;l>1;l-=2)
			{
				System.out.print(" ");
			}
			for(int n=1;n<=m;n++)
			{
				System.out.print(number(m,n));
			}
			System.out.println();
		}

	}

}

