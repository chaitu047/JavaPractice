package printinginitials;

import java.util.Scanner;
/*
 * Consider that values of alphabet A-Z run like Fibonacci series with A = 0, B = 1, C = A+B, D = B + C and so on. Now calculate the numeric value of the given String like ‘MAN’.
Input : ABC
Output : 2 
Input: MAN
Output: 377

 */
public class FibanocciAlpha {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int alpha[] = new int[26];
		int sum=0;
		String word = scan.next();
		scan.close();
		alpha[0]=0;
		alpha[1]=1;
		for(int i=2;i<26;i++)
		{
			alpha[i]=alpha[i-1]+alpha[i-2];
		}
		for(int j=0;j<word.length();j++)
		{
			sum+=alpha[(int)(word.charAt(j)-65)];
		}
		System.out.println(sum);
	}

}
