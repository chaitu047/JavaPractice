package javatpoint;

public class MatrixMultiply {
	
	public static void matrixMultiplication(int[][] a,int[][] b)
	{
		int[][] sum = new int[a.length][a.length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum[i][j]=0;
				for(int k=0;k<a[i].length;k++)
				{
					sum[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
						{1,1,1},
						{1,1,1},
						{1,1,1},
					};
		int[][] b = {
				{0,0,0},
				{0,0,0},
				{0,0,0},
			};
		matrixMultiplication(a, b);
	}

}
