package prcaticeCocubes;

import java.util.Scanner;

public class LargestOfThreeConditionalOperator {

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
		
		int num = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		
		System.out.println("largest number " + num);
	}

}
