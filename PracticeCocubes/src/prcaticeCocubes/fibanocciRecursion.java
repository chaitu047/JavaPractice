package prcaticeCocubes;

public class fibanocciRecursion {
	
	static int n1 = 0, n2 =1,n3 =0;

	public static void fibanocci(int a)
	{
		if(a>2)
		{
			fibanocci(a-1);
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.print(n3+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 9;
		System.out.print("0"+" "+"1"+" ");
		fibanocci(a);
	}

}
