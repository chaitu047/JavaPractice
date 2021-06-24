package javatutorial;

import java.util.Scanner;

public class MinIntoYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int min,years,days,hours,mins,hr,dy;
		
		System.out.println("Enter minutes :");
		min=scan.nextInt();
		scan.close();
		
		mins=min%60;
		hours=min/60;
		hr=hours%24;
		days=hours/24;
		dy=days%365;
		years=days/365;
		
		System.out.println("Years :"+years+" days :"+dy+" hours :"+hr+" min :"+mins);
		
	}

}
