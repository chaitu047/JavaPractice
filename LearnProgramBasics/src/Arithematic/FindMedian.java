package Arithematic;

import java.util.Arrays;

public class FindMedian {
	
	public static void findMedian(int[] a)
	{
		Arrays.sort(a);
		for(int i:a)
		{
			System.out.println(i);
		}
		int len = a.length;
		System.out.println("__________________________________");
		System.out.println("Median");
		if(len%2!=0)
		{
			System.out.println((a[len/2]));
		}
		else
		{
			System.out.println((a[len/2]+a[len/2+1])/2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,2,3,4,98,65,24,12,34,74,15,18,26,105};
		findMedian(a);
	}

}
