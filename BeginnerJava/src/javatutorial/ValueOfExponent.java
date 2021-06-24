package javatutorial;

import java.util.Scanner;

public class ValueOfExponent {

	public static int calculateRad(int base,int value)
	{
		int i=0;
		while(value!=1)
		{
			if(value%base==0)
			{
				++i;
				value=value/base;
			}
			else
			{
				return(-1);
			}
		}
		return(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter base value");
		
		int base  = scan.nextInt();
		
		System.out.println("Enter value");
		
		int value = scan.nextInt();
		
		scan.close();
		
		System.out.println(calculateRad(base,value));
	}

}
