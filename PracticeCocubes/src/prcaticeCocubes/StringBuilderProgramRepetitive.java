package prcaticeCocubes;

import java.util.Scanner;

public class StringBuilderProgramRepetitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	
	StringBuilder string = new StringBuilder(scan.nextLine());
	scan.close();
	char current = string.charAt(0),next;
	int count=1;
	for(int i=1;i<string.length();i++)
	{
		next=string.charAt(i);
		if(next==current)
		{
			string.deleteCharAt(i);
			i=i-1;
			count++;
		}
		else
		{
			string.insert(i,count);
			count=1;
			i++;
			current=next;
		}
	}
	string.append(count);
	System.out.println(string);
	}

}
