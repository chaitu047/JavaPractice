package prcaticeCocubes;

public class CheckSumOfPrimeNumbers {

	public static boolean primeOrNot(int a)
	{
		int count=0;
		
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 25;
		boolean b = false;
		for(int j=1;j<i;j++)
		{
			if(primeOrNot(j))
			{
				
				if(primeOrNot(i-j))
				{
					System.out.print(j+" ");
					System.out.print(i-j+" ");
					b = true;
				}
			}
		}
		System.out.println(b);
	}

}
