package prcaticeCocubes;

import java.util.Scanner;

public class FindSumLeavingOutRowAndColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2,3,4},{3,4,5,1},{5,6,17,19},{7,8,1,2},{9,10,11,8}};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter row");
		int row = scan.nextInt();
		System.out.println("enter col");
		int col = scan.nextInt();
		scan.close();
		int sum = 0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==row || j==col)
				{
					sum+=0;
				}
				else
				{
					System.out.println(a[i][j]);
					sum+=a[i][j];
				}
			}
		}
		System.out.println("result"+sum);
	}

}
