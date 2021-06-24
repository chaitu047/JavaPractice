package javatpoint;

public class Palindrome {
	
	public static void isPalindrome(int n)
	{
		int temp = n;
		int sum=0;
		while(temp!=0)
		{
			int rem=temp%10;
			sum=(sum*10)+rem;
			temp/=10;
		}
		System.out.println(sum);
		if(n==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
	
	public static void isPalindromeString(int a)
	{
		StringBuilder temp = new StringBuilder(String.valueOf(a));
		if(String.valueOf(a).equalsIgnoreCase(temp.reverse().toString()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//isPalindrome(13431);
		isPalindromeString(12320);
	}

}
