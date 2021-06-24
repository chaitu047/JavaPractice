package javatutorial;

public class ArrayProg {
/*
 * WAP to calculate the average value of an integer array.
Write a program to print the sum of cubes of the elements of an Integer array. (Take array size = 5)
Write logic for moving array elements from left to right and last element to first position. Elements of array need to be moved by given no of positions.
Input : [1, 2, 3, 4] , 2
Output  : [3, 4, 1, 2]
- WAP to read 3x3 matrix in 2 dim. array and print diagnonal elements only.
- WAP to read 3x3 matrix and print highest number in each row.
- WAP to create 2 integer arrays of matrix 3X3 and find the sum of these arrays.



 */
	public static void highnumber()
	{
		int[][] arrc = {{1,2,3},{4,5,6,7,8,9},{10,11,23,98,65,451}};
		int max=0;
		for(int i=0;i<arrc.length;i++)
		{
			max=arrc[i][0];
			for(int j=1;j<arrc[i].length;j++)
			{
				if(max<arrc[i][j])
				{
					max=arrc[i][j];
				}
			}
			System.out.println("MAX : "+max);
		}
		System.out.println();
	}
	public static void printdiag()
	{
		int[][] arrb = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Print Diagonal Elements");
		for(int i=0;i<arrb.length;i++)
		{
			for(int j=0;j<arrb[i].length;j++)
			{
				if(i==j)
					System.out.print(arrb[i][j]+" ");
			}
		}
		System.out.println();
	}
	public static void arrfun()
	{
		int[][] arra={{1,2,3},{4,5,6},{7,8,9},{1,2,3,4,5},{9,8}};
		int sum=0;
		
		for(int[] arr : arra)
		{
			for(int a : arr)
			{
				sum+=a;
			}
		}
		System.out.println("Sum "+sum);
	}
	
	public static void insertAtPos(int a,int c,int len,int[] b)
	{
		int j=0;
		for(j = len;j>=a;j--)
		{
			b[j+1]=b[j];
		}
		b[j]=c;
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println("____________________________");
	}
	
	public static void deleteAtPos(int pos,int len,int[] c)
	{
		for(int j=pos;j<len;j++)
		{
			c[j-1]=c[j];
		}
		
		for(int i=0;i<len;i++)
		{
			System.out.println(c[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[] temp = new int[arr.length];
		int[] b = new int[10];
		/*int shift = 3;
		for(int i=shift,j=0;i<arr.length;i++,j++)
		{
			temp[i]=arr[j];
		}
		for(int k=0,m=arr.length-shift;k<shift;k++,m++)
		{
			temp[k]=arr[m];
		}
		for(int l=0;l<arr.length;l++)
		System.out.print(temp[l]+" ");
		System.out.println();
		arrfun();
		printdiag();
		highnumber();*/
		for(int i=0;i<=8;i++)
		{
			b[i]=i;
		}
		insertAtPos(3,17,8,b);
		deleteAtPos(3,8,b);
	}

}
