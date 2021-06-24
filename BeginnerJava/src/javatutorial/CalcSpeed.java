package javatutorial;
import java.util.Scanner;

public class CalcSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int timeinsec,hours,min,sec;
		String gettime = new String();
		double distance;
		
		System.out.println("Enter distance in metres");
		distance=scan.nextDouble();
		
		System.out.println("Enter time in format hr:min:sec");
		gettime=scan.next();
		scan.close();
		
		String[] formattedtime = gettime.split(":");
		
		hours=Integer.parseInt(formattedtime[0]);
		min=Integer.parseInt(formattedtime[1]);
		sec=Integer.parseInt(formattedtime[2]);
		timeinsec=hours*60*60+min*60+sec;
		
		System.out.println("speed in mps "+(distance/timeinsec));
		System.out.println("speed in kmph "+((distance/1000/timeinsec)*3600));
		System.out.println("speed im mph "+((distance/1609/timeinsec)*3600));
	}

}
