package javatpoint;

public class SquareRoot {
	
	public static float findSquareRoot(int ub,int lb,int num)
	{
		float sqrt = (ub+lb)/2;
		int sqr = (int)(sqrt*sqrt);
		if(sqr==num)
		{
			return sqrt;
		}
		else
		{
			if(sqr>(int)sqrt)
			{
				return findSquareRoot(ub, (int) sqrt, num);
			}
			else
			{
				return findSquareRoot((int) sqrt, ub, num);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findSquareRoot(1, 25, 25));
	}

}
