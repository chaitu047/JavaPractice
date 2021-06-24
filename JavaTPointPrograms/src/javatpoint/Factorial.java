package javatpoint;

public class Factorial {
	
	public static int factRecur(int n) {
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n*factRecur(n-1);
		}
	}
	
	public static void factLoop(int n)
	{
		int fact = 1;
		for(int i=n;i>=1;i--)
		{
			fact*=i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(factRecur(4));
		factLoop(5);
	}

}
