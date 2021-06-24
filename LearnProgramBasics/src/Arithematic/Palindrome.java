package Arithematic;

public class Palindrome {
	
	public static boolean isPalindrome(int a)
	{
		int temp = a;
		int result = 0;
		
		while(temp!=0)
		{
			int rem = temp%10;
			result = (result*10)+rem;
			temp/=10;
		}
		
		if(result==a)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isPalindrome(String str)
	{
		String test = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(test))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(1331));
		System.out.println(isPalindrome(12321));
		System.out.println(isPalindrome(13431));
		System.out.println(isPalindrome(10301));
	}

}
