package jconstructors.test;

public class ConstructorTest {

	public static int fib(int n)
	{
			if(n==0)
				return(0);
			if(n<2)
				return(1);
			else
			{
				return(fib(n-1)+fib(n-2));
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=1;n<=8;n++)
		System.out.println(fib(n)+" ");
	}

}
