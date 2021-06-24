package prcaticeCocubes;

public class PowerOfNumberUsingRecursion {

	public static int power(int a,int i)
	{
		if(i==0)
		{
			return(1);
		}
		else
		{
			return(a*power(a,i-1));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(4,3));
	}

}
