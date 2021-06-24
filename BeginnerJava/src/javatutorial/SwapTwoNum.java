package javatutorial;

import java.util.Scanner;

public class SwapTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int temp=0;
		System.out.println("Enter two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		System.out.println("before swaping a = "+a+" b = "+b);
		temp=b;
		b=a;
		a=temp;
		System.out.println("after swaping a = "+a+" b = "+b);
	}

}
