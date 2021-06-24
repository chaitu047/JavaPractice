package prcaticeCocubes;

public class OctalToDecimal {
	
	public static void main(String[] args)
	{
		int a = 123; 
		int decimal = 0,n =0;
		
		while(a!=0)
		{
			int temp = a%10;
			decimal+=temp*Math.pow(8,n);
			a=a/10;
			n++;
			
		}
		System.out.println(decimal);
	}
}
