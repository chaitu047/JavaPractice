package javatutorial;
import java.util.Scanner;

public class BmiCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter height and weight");
		float height = scan.nextFloat();
		float mass = scan.nextFloat();
		scan.close();
		float bmi=mass/(height*height);
		System.out.println("BMI = "+bmi);
	}

}
