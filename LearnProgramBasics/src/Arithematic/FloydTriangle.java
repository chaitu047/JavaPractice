package Arithematic;

public class FloydTriangle {
	
	public static void printFloyd(int n)
	{
		int i=0;
		for(int j=0;j<n;j++)
		{
			for(int k=0;k<=j;k++)
			{
				System.out.print(i++ + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		printFloyd(6);
	}

}
