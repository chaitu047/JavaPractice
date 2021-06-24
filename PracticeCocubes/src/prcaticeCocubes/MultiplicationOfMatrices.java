package prcaticeCocubes;

public class MultiplicationOfMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}}; 
		
		int mul[][] = new int[3][3];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				for(int k=0;k<a[0].length;k++)
				{
					mul[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		
		for(int i=0;i<mul.length;i++)
		{
			for(int j=0;j<mul[0].length;j++)
			{
				System.out.print(mul[i][j]+" ");
			}
			
			System.out.println();
		}
		

	}

}
