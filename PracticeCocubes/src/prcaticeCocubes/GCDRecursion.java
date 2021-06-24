package prcaticeCocubes;

public class GCDRecursion {
	
	static int gcd=0;
	
	public static int gcd(int a,int b)
	{
		if(a==0)
		{
			return gcd;
		}
		gcd=a;
		return(gcd(a%b,gcd));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(12,60));
	}

}
