package Arithematic;

public class PrimeNumbers {
	
	public static void printPrimes(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static void factors(int n)
	{
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static boolean isPrime(int n)
	{
		int count = 0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		return (count==0)?true:false;
	}

	public static int printLargestPrimeFactor(int a)
	{
		int max = -1;
		
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				if(isPrime(i))
				{
					max=Math.max(max, i);
				}
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPrimes(100);
		System.out.println();
		System.out.println("_____________________________________________");
		System.out.println(printLargestPrimeFactor(27*13*19*56*64));
	}

}
