package javatutorial;

import java.util.Scanner;

public class AttendPercent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int attend,conduct;
		double result;
		System.out.println("Enter no. of classes conducted :");
		conduct = scan.nextInt();
		System.out.println("Enter no. of classes attended :");
		attend = scan.nextInt();
		scan.close();
		result=((double)attend/conduct)*100;
		if(result < 75)
		{
			System.out.println("Not allowed to sit");
		}
		else
		{
			System.out.println("Allowed to sit");
		}
	}

}
