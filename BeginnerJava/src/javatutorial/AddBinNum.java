package javatutorial;

import java.util.Scanner;

public class AddBinNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0, x, y, sum = 0, c = 0, i = 1, z = 0;
		System.out.println("enter binary numbers");
		x = scan.nextInt();
		y = scan.nextInt();
		scan.close();
		a = 0;
		b = 0;
		while (x != 0 || y != 0) {
			a = x % 10;
			b = y % 10;
			x /= 10;
			y /= 10;
			if (a == 1 && b == 1) {
				sum = c;
				c = 1;
			} else {
				if (a + b + c == 2) {
					sum = 0;
					c = 1;
				} else {
					sum = a + b + c;
					c = 0;
				}
			}
			z = z + i * sum;
			i *= 10;
		}
		System.out.println("Sum =" + z + "carry =" + c);
	}

}
