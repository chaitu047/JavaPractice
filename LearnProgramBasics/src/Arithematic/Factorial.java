package Arithematic;

public class Factorial {
	
	public static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}

	public static int factorialLoop(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorial(5));
		System.out.println(factorialLoop(6));

	}

}
