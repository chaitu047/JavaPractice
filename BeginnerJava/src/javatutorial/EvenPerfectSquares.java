package javatutorial;

public class EvenPerfectSquares {

	public static boolean checkEven(int a)
	{
		while(a!=0)
		{
			int temp=a%10;
			if(temp%2!=0)
			{
				return(false);
			}
			a=a/10;
		}
		return(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=32;i<100;i+=2)
		{
			int temp=(int)Math.pow(i, 2);
				if(checkEven(temp))
				{
					System.out.println(temp);
				}
		}
	}

}
