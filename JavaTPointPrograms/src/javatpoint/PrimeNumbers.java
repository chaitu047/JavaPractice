package javatpoint;

public class PrimeNumbers {
	
	public static void printPrimes(int n)
	{
		for(int i=2;i<=n;i++)
		{
			int count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.print(i+" ");
			}
		}
		
	}
	
	public static void printPrimeFactors(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				int count=0;
				for(int j=2;j<=i/2;j++)
				{
					count++;
				}
				if(count==0)
				{
					System.out.print(i+" ");
				}
			}
		}
	}
	
	public static void printFactors(int n)
	{
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void printNthPrime(int n)
	{
		int i=0,j=2;
		
		boolean b=true;
		
		int prime=2;
		
		while(b)
		{
			if(isPrime(j))
			{
					i++;
					prime = j;
			}
			
			if(i>n)
			{
				b=false;
			}
			j++;
		}
		
		System.out.println(prime);
	}
	
	public static boolean isPrime(int num)
	{
		int count = 0;
		boolean b = false;
		for(int j=2;j<=num/2;j++)
		{
			if(num%j==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			b = true;
		}
		return b;
	}
	
	public static void displayAlternatePrimes(int n)
	{
		int i=0,j=2;
		boolean b = true;
		boolean even = true;
		while(b)
		{
			if(isPrime(j))
			{
				i++;
				if(even==true)
				{
				System.out.println(j);
				}
				even = !even;
			}
			if(i>n)
			{
				b=false;
			}
			j++;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printPrimes(100);
		//printPrimeFactors(125*64);
		//printFactors(125);
		//printNthPrime(4);
		displayAlternatePrimes(50);
	}

}
