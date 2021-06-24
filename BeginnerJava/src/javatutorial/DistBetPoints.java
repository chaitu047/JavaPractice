package javatutorial;

import java.util.Scanner;

public class DistBetPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x,y,s,t,dist;
		
		System.out.println("Enter co-ordinates of first point :");
		x=scan.nextFloat();
		y=scan.nextFloat();
		
		System.out.println("Enter co-ordinates of second point :");
		s=scan.nextFloat();
		t=scan.nextFloat();
		scan.close();
		
		dist=Math.sqrt(Math.pow((s-x),2.0d)+Math.pow((t-y),2.0d));
		System.out.println("Distance between points :"+dist);
		}
}