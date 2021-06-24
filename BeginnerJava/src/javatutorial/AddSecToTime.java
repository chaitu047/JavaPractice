package javatutorial;

import java.util.Scanner;

public class AddSecToTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int Hr,Min,Sec,bal,temp,h,m,s;
		String gettime = new String();
		
		System.out.println("enter time in hr:min:sec format");
		
		gettime=scan.next();
		
		String[] formatted = gettime.split(":");
		Hr=Integer.parseInt(formatted[0]);
		Min=Integer.parseInt(formatted[1]);
		Sec=Integer.parseInt(formatted[2]);
		
		System.out.println("Enter seconds to be added");
		
		bal=scan.nextInt();
		scan.close();
		
		temp=Hr*60*60+Min*60+Sec+bal;
		s=temp%60;
		bal=temp/60;
		m=bal%60;
		h=temp/3600;
		
		System.out.println("Time Hr :"+h+" Min :"+m+" Sec :"+s);
	}

}
