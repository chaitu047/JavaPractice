package prcaticeCocubes;

public class SumOfDaigonalElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16}};
		
		int b[][] = new int[4][4];
		
		int sum=0;
		
		for(int i=0;i<a[0].length;i++)
		{
			sum+=a[i][i];
		}
		
		System.out.println("Sum of diagonal elements :" + sum);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
		System.out.println("Transpose Of Matrix");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			
			System.out.println();
		}
	}

}
