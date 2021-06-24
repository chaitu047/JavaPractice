package javatutorial;

import java.util.Scanner;
import java.util.*;

public class BallotCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Vector<String> list = new Vector<String>();
		int temp=0,spol=0,c1=0,c2=0,c3=0,c4=0,c5=0;
		String array[] = new String[40];
		int ar[] = new int[40];
		while((temp=scan.nextInt())!=0)
		{
			if(temp>5)
			{
				System.out.println("Spoilt ballot");
				spol++;
			}
			else
			{
				list.addElement(String.valueOf(temp));	
			}
		}
		list.copyInto(array);
		for(int i=0;i<list.size();i++)
		{
			ar[i]=Integer.parseInt(array[i]);
		}
		for(int j=0;j<=list.size();j++)
		{
			if(ar[j]==1)
			{
				c1++;
			}
			else if(ar[j]==2)
			{
				c2++;
			}
			else if(ar[j]==3)
			{
				c3++;
			}
			else if(ar[j]==4)
			{
				c4++;
			}
			else
			{
				c5++;
			}
		}
		System.out.println("Candidate 1:"+c1+"\tCandidate 2:"+c2+"\tCandidate 3:"+c3+"\tCandidate 4:"+c4+"\tCandidate 5:"+c5);
		System.out.println("Spoilt ballots"+spol);
		scan.close();
	}

}
