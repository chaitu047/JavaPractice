package javatutorial;

import java.util.Scanner;

class InitArray{
	int[] arr = new int[10];
	void sort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arrfin[] = new int[20];
		System.out.println("Enter numbers into A");
		InitArray a = new InitArray();
		for(int i=0;i<a.arr.length;i++)
		{
			a.arr[i]=scan.nextInt();
		}
		System.out.println("Enter numbers into B");
		InitArray b = new InitArray();
		for(int j=0;j<b.arr.length;j++)
		{
			b.arr[j]=scan.nextInt();
		}
		scan.close();
		a.sort(a.arr);
		b.sort(b.arr);
		System.out.println("Sorted Arrays");
		for(int i : a.arr)
		{
			System.out.println(i);
		}
		System.out.println("second array");
		for(int j: b.arr)
		{
			System.out.println(j);
		}
		System.out.println("second array");
		for(int i=0,k=0;i<arrfin.length;i++)
		{
			if(i<a.arr.length)
			{
				arrfin[i]=a.arr[i];
			}
			else
			{
				arrfin[i]=b.arr[k++];
			}
		}
		for(int i=0;i<arrfin.length;i++)
		{
			for(int j=i+1;j<arrfin.length;j++)
			{
				if(arrfin[i]>arrfin[j])
				{
					int temp = arrfin[i];
					arrfin[i]=arrfin[j];
					arrfin[j]=temp;
				}
			}
		}
		for(int i:arrfin)
		{
			System.out.println(i);
		}
		
	}

}
