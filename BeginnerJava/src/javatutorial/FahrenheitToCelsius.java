package javatutorial;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature in F");
		float Fahrenheit=scan.nextFloat();
		scan.close();
		float Celsius=(Fahrenheit-32)*5/9;
		System.out.println(Fahrenheit+" Fahrenheit = "+Celsius+" Celsius");
	}

}
