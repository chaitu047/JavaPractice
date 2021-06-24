package prcaticeCocubes;

import java.util.Scanner;

public class StringBuilderPalindrome {
	
	public static boolean isPalindrome(StringBuilder s)
	{
		int l = s.length()/2;
		int n = s.length()-1;
		for(int i=0;i<=l;i++)
		{
			if(!(s.charAt(i)==s.charAt(n-i)))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(new Scanner(System.in).nextLine());
		
		StringBuilder s = new StringBuilder();
		
		boolean finish = true;
		
		if(isPalindrome(sb))
		{
			System.out.println("NULL");
		}
		
		while(finish)
		{
			if(isPalindrome(sb))
			{
				finish = false;
			}
			else
			{
				s.append(sb.charAt(0));
				sb = new StringBuilder(sb.substring(1));
			}
		}
		System.out.println(s.reverse());
	}

}
