package prcaticeCocubes;

import java.util.Scanner;

public class SolveQuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a");
		int a = scan.nextInt();
		System.out.println("Enter b");
		int b = scan.nextInt();
		System.out.println("Enter c");
		int c = scan.nextInt();
		scan.close();
		int det = (b*b)-(4*a*c);
		double roota = 0;
		double rootb = 0;
		if(det>0)
		{
			System.out.println("real roots");
			roota = (-b+Math.sqrt(det))/(2*a);
			rootb = (-b-Math.sqrt(det))/(2*a);
			System.out.println(roota + " " + rootb);
		}
		else if(det==0)
		{
			System.out.println("Single root");
			System.out.println(-b);
		}
		else
		{
			System.out.println("complex roots");
			roota = (-b+Math.sqrt(-1*det))/(2*a);
			rootb = (-b-Math.sqrt(-1*det))/(2*a);
			System.out.println(roota + " i" + rootb);
		}
	}

}
