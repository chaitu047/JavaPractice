package prcaticeCocubes;

public class PrintNumbersRecursion {
	
	public static void printNumbers(int a)
	{
		if(a>0)
		{
			printNumbers(a-1);
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumbers(100);
	}

}
