package javatpoint;

public class printPatterns {

	public static void printTriangle(int rows) {
		
		//     * 
		//    * * 
		//   * * * 
		//  * * * * 
		// * * * * * 

		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void printTriangleWithDigits(int rows) {
		
		//     0 
		//    1 2 
		//    3 4 5 
		//   6 7 8 9 
		//10 11 12 13 14 

		int count = 0;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}
	
	public static void printStaircase(int rows)
	{
		//     *
		//    **
		//   ***
		//  ****
		// *****
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<rows-i-1;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printSpiral(int rows)
	{
		int[][] m = new int[rows][rows];
		
		int top=0,left=0,right=rows-1,down=rows-1,count=0,dir=0;
		
		while(top<=down && left<=right)
		{
			if(dir==0)
			{
				for(int i=left;i<=right;i++)
				{
					m[top][i] = count++;
				}
				top+=1;
			}
			
			else if(dir==1)
			{
				for(int i=top;i<=down;i++)
				{
					m[i][right] = count++;
				}
				right-=1;
			}
			
			else if(dir==2)
			{
				for(int i=right;i>=left;i--)
				{
					m[down][i] = count++;
				}
				down-=1;
			}
			
			else if(dir==3)
			{
				for(int i=down;i>=top;i--)
				{
					m[i][left] = count++;
				}
				left+=1;
			}
			dir=(dir+1)%4;
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<rows;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void printPatterns(int a)
	{
		
		//5432*
		//543*1
		//54*21
		//5*321
		//*4321

		
		for(int i=0;i<a;i++)
		{
			for(int j=a;j>0;j--)
			{
				if(j==i+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
	
	public static void weirdPattern(int l)
	{
		
		//1     1
		// 2   2
		//  3 3
		//   4
		//  3 3
		// 2   2
		//1     1 
  
		for(int i=1;i<=l;i++)
		{
			for(int j=1;j<=2*l;j++)
			{
				if(j==i || j==2*l-i)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=l-1;i>0;i--)
		{
			for(int j=1;j<=2*l;j++)
			{
				if(j==i || j==2*l-i)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printCircularSpiral(int n)
	{
		//1 2 3 4 5 
		//16          6 
		//15          7 
		//14          8 
		//13 12 11 10 9 

		
		int[][] m = new int[n][n];
		int left = 0,right=n-1,top=0,down=n-1,dir=0,count=1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				m[i][j] = -1;
			}
		}
		
		if(dir==0)
		{
			for(int i=left;i<=right;i++)
			{
				m[top][i]=count++;
			}
			top+=1;
			dir=1;
		}
		
		if(dir==1)
		{
			for(int i=top;i<=down;i++)
			{
				m[i][right]=count++;
			}
			right-=1;
			dir=2;
		}
		
		if(dir==2)
		{
			for(int i=right;i>=left;i--)
			{
				m[down][i]=count++;
			}
			down-=1;
			dir=3;
		}
		
		if(dir==3)
		{
			for(int i=down;i>=top;i--)
			{
				m[i][left]=count++;
			}
			left+=1;
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(m[i][j] == -1)
				{
					if(i==0 || i==n-1)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("   ");
					}
				}
				else
				{
					System.out.print(m[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printElevenTriangle(int rows)
	{
		//_ _ _1
		//_ _ 1 1
		//_ _1 2 1
		//_ 1 3 3 1
		//_1 4 6 4 1
		//1 6 1 0 5 1
		
		int count = 1;
		for(int i=0;i<rows;i++)
		{
			
			for(int j=0;j<rows-i-1;j++)
			{
				System.out.print(" ");
			}
			
			String[] str = String.valueOf(count).split("");
			
			for(String s : str)
			{
				System.out.print(s+" ");
			}
			/*
			
				for(int j=0;j<=i;j++)
				{
				
					System.out.print(str[j]+" ");
				
				}
				
			*/
			count*=11;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printTriangle(5);
		//printTriangleWithDigits(5);
		//printStaircase(5);
		//printSpiral(10);
		//printPatterns(5);
		//weirdPattern(4);
		//printCircularSpiral(5);
		printElevenTriangle(6);
		
	}

}



//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
// * * * * * *
//* * * * * * *