package Arithematic;

public class FibanocciSeries {
	
	
	public static void fibanocciSeries(int n)
	{
		if(n==1)
		{
			System.out.println(0);
		}
		else if(n==2)
		{
			System.out.println(0+" "+1);
		}
		else
		{
			int a = 0;
			int b = 1;
			System.out.print(a+" "+b);
			for(int i=0;i<n-2;i++)
			{
				int c = a+b;
				a=b;
				b=c;
				System.out.print(" "+c);
			}
		}
	}
	
	public static int fibanocci(int n)
	{
		int a = 0;
		int b = 1;
		int c = 0;
		if(n==1)
		{
			return 0; 
		}
		else if(n==2)
		{
			return 1;
		}
		else
		{
			for(int i=0;i<n-2;i++)
			{
				c = a+b;
				a = b;
				b = c;
			}
			return c;
		}
	}
	
	public static void fibanocciRecursive(int a,int b,int c,int n)
	{
		if(n>1)
		{
			System.out.print(c+" ");
			c = a+b;
			a=b;
			b=c;
			fibanocciRecursive(a,b,c,n-1);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibanocciSeries(11);
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.println(fibanocci(11));
		System.out.println();
		System.out.println("-------------------------------------------------------");
		fibanocciRecursive(0,1,0,11);
	}

}
