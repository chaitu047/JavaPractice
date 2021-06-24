package javatutorial;

import java.util.Scanner;

/*
- WAP to check if the given number is palindrome.
- WAP to count the number of factors of the given number.
- WAP to take generate Fibonacci series for given number of turns.
- Write a program to find the factorial of a given number.
*/
/*
 * Write a program to print FizzBuzz sequence from  1 to 100 
Follow below rules 
- Divisible by 3 - print FIZZ, 
- Divisible by 5 - print BUZZ 
- Divisible by both 3 and 5 - FIZZBUZZ
- Else print the number itself
---------------------------------------------------------
Write a program to print the max of 3 given numbers
---------------------------------------------------------
David is following an exercise regime where on first, second and third day he works out for 1, 2 and 3 minutes. After 3 days, his workout duration is sum of the 3 previous days. What is his workout duration (in minutes) after ‘n’ days, where n is greater than 4. 
---------------------------------------------------------
Write a program to check if a give number is an Odd Palindrome i.e. a palindrome with all digits odd. Ex: 131  

 */
public class BasicProg {
	static int n1 = 0, n2 = 1, n3;

	public static boolean palindrome(int a) {
		if (a > 100) {
			int k = 0, rem, num = a;
			while (num != 0) {
				rem = num % 10;
				k = k * 10 + rem;
				num /= 10;
			}
			if (k == a) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static void factors(int a) {
		int num = a, i;
		System.out.print("factors");
		for (i = 1; i < a; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	public static void primenumberrange(int init,int limit)
	{
		for(int i=init;i<=limit;i++)
		{
			int temp=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					temp++;
				}
				else
				{
					temp+=0;
				}
				
			}
			if(temp==1)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
	}
	public static void fibanocci(int a) {
		if (a >= 0) {
			n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
			System.out.print(n3 + " ");
			fibanocci(a - 1);
		}
	}

	public static int factorial(int a) {
		int fact;
		if (a == 1) {
			return (1);
		} else {
			fact = factorial(a - 1) * a;
			return (fact);
		}
	}
	public static void sumoffactors(int a)
	{
		int sum=0;
		int num=a;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		System.out.println("Sum of numbers "+sum);
	}
	public static void sumofdigits(int a)
	{
		int sum=0;
		while(a!=0)
		{
			int rem=a%10;
			sum+=rem;
			a/=10;
		}
		System.out.println("Sum of digits"+sum);
	}
	public static void sumofdiv(int a,int b,int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(i%a==0 || i%b==0)
			{
				sum+=i;
			}
		}
		System.out.println("sum of numbers divisible by"+a+"and"+b+" :"+sum);
	}
	public static void gymroutine(int n)
	{
		int a=1,b=2,c=3,d=0;
		for(int i=4;i<=n;i++)
		{
			d=a+b+c;
			a=b;
			b=c;
			c=d;
		}
		System.out.println("no. of minutes on day"+n+" :"+d);
	}
	public static String printfizzbuzz(int i)
	{
		String res = "";
		if (i % 3 == 0)
		{
			res += "Fizz";
		}
		if (i % 5 == 0)
		{
			res += "Bizz";
		}
		if (i % 7 == 0) 
		{
			res += "Dizz";
		}
		if(res=="")
		{
			res=String.valueOf(i);
		}
		return (res);
	}
	public static boolean checkAllOdd(int a)
	{
		while(a!=0)
		{
			if((a%10)%2==0)
			{
				return false;
			}
			a/=10;
		}
		return true;
	}
	public static void oddPalindrome(int a)
	{
		if(checkAllOdd(a) && palindrome(a))
		{
			System.out.println("OddPalindrome");
		}
		else
		{
			System.out.println("Not OddPalindrome");
		}
	}
	public static int maximum(int a,int b,int c)
	{
		int maximum=0;
		if(a>maximum)
		{
			maximum=a;
		}
		if(b>maximum)
		{
			maximum=b;
		}
		if(c>maximum)
		{
			maximum=c;
		}
		return maximum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it is a Palindrome");
		int a = scan.nextInt();
		scan.close();
		palindrome(a);
		factors(a);
		fibanocci(a);
		System.out.println("\n" + factorial(a));
		primenumberrange(2,100);
		sumoffactors(a);
		sumofdigits(a);
		sumofdiv(3,5,25);
		gymroutine(6);
		System.out.println();
		for(int i=1;i<=100;i++)
		System.out.println(printfizzbuzz(i));
		oddPalindrome(a);
		System.out.println(maximum(20,369,156));
	}

}