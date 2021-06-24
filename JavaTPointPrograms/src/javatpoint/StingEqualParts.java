package javatpoint;

public class StingEqualParts {

	public static void main(String[] args)
	{
		int n = 10;
		String test = "Because of Budda charishma budda and gadidha modda";
		int div = test.length()/n;
		if(test.length()>n)
		{
			int count=0;
			for(int i=0;i<test.length();)
			{
				System.out.println(test.substring(i,i+div-1) + count);
				i+=div;
				count++;
			}
		}
	}
	
}
