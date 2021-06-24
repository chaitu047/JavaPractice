package javatpoint;

public class FibanocciSeries {
	
	public static void printFibanocci(int n)
	{
		if(n==0)
		{
			System.out.println("0");
		}
		else if(n==1)
		{
			System.out.println("0"+" "+"1");
		}
		else
		{
			int a=0,b=1,c=0;
			System.out.print("0"+" "+"1"+" ");
			for(int i=0;i<n-2;i++)
			{
				c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}
		}
		System.out.println();
	}
	
	public static int printFibanocciNthTerm(int n)
	{
		if(n>=0 && n<=1)
		{
			return n;
		}
		else
		{
			int a=0,b=1,c=0;
			for(int i=0;i<n-2;i++)
			{
				c=a+b;
				a=b;
				b=c;
			}
			return c;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFibanocci(7);
		System.out.println(printFibanocciNthTerm(7));
	}

}
