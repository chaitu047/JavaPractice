package javatutorial;

import java.util.Scanner;

public class WrapClasses {

	public static float loan(float p,float i,int y)
	{
		float temp=p*i*y/100;
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter principle amount");
		String pricipleString=scan.nextLine();
		Float principle = new Float(0);
		principle = Float.valueOf(pricipleString);
		Float Intrest = new Float(0);
		String IntrestString = scan.nextLine();
		Intrest = Float.valueOf(IntrestString);
		Integer Years = new Integer(0);
		String year = scan.nextLine();
		Years = Integer.valueOf(year);
		float value=loan(principle.floatValue(),Intrest.floatValue(),Years.intValue());
		System.out.println(value+principle.floatValue());
		scan.close();

	}

}
