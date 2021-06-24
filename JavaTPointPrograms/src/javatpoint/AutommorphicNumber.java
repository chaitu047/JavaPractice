package javatpoint;

public class AutommorphicNumber {

	public static void isAutomorphicNumber(int num)
	{
		int len = String.valueOf(num).length();
		
		int res = num*num;
		
		int reslen = String.valueOf(res).length();
		
		String sub = String.valueOf(res).substring(reslen-len);
		
		if(sub.equals(String.valueOf(num)))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isAutomorphicNumber(25);
	}

}
