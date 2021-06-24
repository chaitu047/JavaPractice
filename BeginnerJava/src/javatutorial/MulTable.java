package javatutorial;

public class MulTable {
	final static int ROWS=10;
	final static int COLUMNS=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] product = new int[ROWS][COLUMNS];
		System.out.println("MULTIPLICATION TABLE");
		System.out.println(" ");
		for(int i=10,k=0;k<ROWS;i++,k++)
		{
			for(int j=10,l=0;l<COLUMNS;j++,l++)
			{
				product[k][l]=i*j;
				System.out.print(" "+product[k][l]);
			}
			System.out.println(" ");
		}
	}

}
