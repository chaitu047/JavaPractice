package javatpoint;

public class RandomNumber {

	public static void printRandom()
	{
		long max = 999999;
		long min = 100000;
		long random = (long)(Math.random()*(max-min+1)+min);
		
		System.out.println(random);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printRandom();
	}

}
