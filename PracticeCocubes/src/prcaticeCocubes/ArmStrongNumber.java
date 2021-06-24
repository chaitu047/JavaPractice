package prcaticeCocubes;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		scan.close();
		int i = num;
		int sum =0;
		while(i!=0)
		{
			int temp = i%10;
			sum += temp*temp*temp;
			i=i/10;
		}
		if(sum==num)
		{
			System.out.println("ArmStrong number");
		}
		else
		{
			System.out.println("not Armstrong number");
		}
	}

}
