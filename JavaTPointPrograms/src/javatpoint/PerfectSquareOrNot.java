package javatpoint;

public class PerfectSquareOrNot {
	
	public static boolean isPerfectSquare(int a)
	{
		boolean b = false;
		
		double c = Math.sqrt(a);
		if((c-Math.floor(c))==0)
		{
			b=true;
		}
		
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPerfectSquare(25));
	}

}
