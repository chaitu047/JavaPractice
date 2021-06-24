package javatutorial;
import java.util.Scanner;

public class SumOfdigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b=0;
		System.out.println("enter number :");
		a=scan.nextInt();
		scan.close();
		while(a!=0)
		{
			b+=a%10;
			a/=10;
		}
		System.out.println("sum ="+b);
	}

}
