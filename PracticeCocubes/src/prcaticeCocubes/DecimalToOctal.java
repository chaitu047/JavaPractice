package prcaticeCocubes;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 659;
		int oct=0;
		int n=1;
		while(a!=0)
		{
			oct+=n*(a%8);
			n*=10;
			a=a/8;
		}
		System.out.println(oct);
	}

}
