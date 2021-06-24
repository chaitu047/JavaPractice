package prcaticeCocubes;

public class SumOfDigitsRecursion {
	
	static int sumofdigits(int a)
	{
		if(a==0)
		{
			return(0);
		}
		else
		{
			return((a%10)+sumofdigits(a/10));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumofdigits(65987));
	}

}
