package prcaticeCocubes;

import java.util.Scanner;

public class LongestPrefixSuffix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		
		String line = scan.nextLine();
		
		scan.close();
		
		int mid = (line.length()+1)/2;
		
		int size = line.length();
		
		int i=0;
		
		while(mid<size)
		{
			if(line.charAt(mid)==line.charAt(i))
			{
				i++;
				mid++;
			}
			else
			{
				i=0;
				mid=mid-i+1;
			}
		}
		
		System.out.println(i);
	}

}
