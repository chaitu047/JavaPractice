package prcaticeCocubes;

import java.util.Scanner;

public class CalculateValueOfString {

	public static void function(StringBuffer s) {
		for (int i = 0; i < s.length(); i = i + 2) {
			if (i+1 < s.length() && (i + 2) < s.length()) {

				if (s.charAt(i + 1) == 'A' || s.charAt(i + 1) == 'a') {
					
					if(s.charAt(i)=='1' && s.charAt(i+2)=='1')
					{
						s.setCharAt(i + 2,'1');
					}
					else
					{
						s.setCharAt(i+2, '0');
					}
				} else if (s.charAt(i + 1) == 'B' || s.charAt(i + 1) == 'b') {
					
					if(s.charAt(i)=='1' || s.charAt(i+2)=='1')
					{
						s.setCharAt(i + 2,'1');
					}
					else
					{
						s.setCharAt(i+2, '0');
					}
					
				} else if (s.charAt(i + 1) == 'C' || s.charAt(i + 1) == 'c') {
					
					if(s.charAt(i)==s.charAt(i+2))
					{
						s.setCharAt(i + 2,'0');
					}
					else
					{
						s.setCharAt(i+2, '1');
					}
					
				}

			}
		}
		System.out.println(s.charAt(s.length()-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String string = scan.nextLine();
		StringBuffer s = new StringBuffer(string);
		scan.close();
		function(s);
	}

}
