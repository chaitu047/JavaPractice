package javatutorial;
import java.util.Scanner;

public class ConInchMetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter inches");
		float inch= scan.nextFloat();
		scan.close();
		float metre=inch*0.0254f;
		System.out.println(inch+" Inches = "+metre+" Metres");

	}

}
