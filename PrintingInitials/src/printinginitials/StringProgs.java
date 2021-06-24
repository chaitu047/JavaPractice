package printinginitials;
import java.util.Scanner;
/*
 * - WAP to convert all the characters in a string to uppercase.
- WAP that counts the total number of words in a given text.
- WAP to check whether two String variables contain the same value.
- WAP to replace all the 'd' characters with 't' characters in below text 
"Doday is dhe besd day of the resd of my life."

 WAP to read 3x3 matrix in 2 dim. array and print diagnonal elements only.
- WAP to read 3x3 matrix and print highest number in each row.
- WAP to create 2 integer arrays of matrix 3X3 and find the sum of 
these arrays.

- Write logic for moving array elements from left to right and last element to first position. Elements of array need to be moved by given no of positions.
Input : [1, 2, 3, 4] , 2
Output  : [3, 4, 1, 2]


 */

public class StringProgs {

	public static void Upcase(String a)
	{
		System.out.println(a.toUpperCase());
	}
	
	public static void nofword(String a)
	{
		String[] s = a.split(" ");
		System.out.println(s.length);
	}
	public static void samevalue(String a,String b)
	{
		System.out.println(a.equals(b));
	}
	public static void rePlace(String a)
	{
		String temp=a.replace('d','t');
		temp=temp.replace('D','T');
		System.out.println(temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String tem=scan.next();
		Upcase(tem);
		String trm=scan.nextLine();
		trm=scan.nextLine();
		nofword(trm);
		String a=scan.next();
		String b=scan.next();
		samevalue(a,b);
		String h="Doday is dhe besd day of the resd of my life.";
		rePlace(h);
		scan.close();
	}

}
