package printinginitials;

import java.util.Scanner;
/*
 * For the given string text, change the case of all the letters
Input : This Is a SAMPLE text!
Output : tHIS iS A sample TEXT!

 */
public class CapsAndSmall {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String output="";
		for(int i=0;i<input.length();i++)
		{
			if(Character.isUpperCase(input.charAt(i)))
			{
				output+=Character.toLowerCase(input.charAt(i));
			}
			else if(Character.isLowerCase(input.charAt(i)))
			{
				output+=Character.toUpperCase(input.charAt(i));
			}
			else
			{
				output+=input.charAt(i);
			}
		}
		System.out.println(output);
		scan.close();
	}
}
