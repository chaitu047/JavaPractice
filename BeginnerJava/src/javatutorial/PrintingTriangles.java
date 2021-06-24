package javatutorial;

import java.util.Scanner;

public class PrintingTriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int k=scan.nextInt();
		scan.close();
		for(int i=1,m=0;i<=k;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(++m);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
