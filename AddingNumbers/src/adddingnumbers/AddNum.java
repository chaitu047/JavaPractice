package adddingnumbers;

import java.util.Scanner;

public class AddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		scan.close();
		System.out.println(num1+num2);
	}

}
