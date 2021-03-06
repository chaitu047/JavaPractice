package javatpoint;

public class ConvMatrixToArray {
	
	public static void convMatrixToArray(int[][] m)
	{
		int top=0,down=m.length-1,left=0,right=m.length-1,dir=0;
		int[] s = new int[m.length*m.length];
		int count=0;
		while(top<=down && left<=right)
		{
			if(dir==0)
			{
				for(int i=left;i<=right;i++)
				{
					s[count++]=m[top][i];
				}
				top+=1;
			}
			
			else if(dir==1)
			{
				for(int i=top;i<=down;i++)
				{
					s[count++]=m[i][right];
				}
				right-=1;
			}
			
			else if(dir==2)
			{
				for(int i=right;i>=left;i--)
				{
					s[count++]=m[down][i];
				}
				down-=1;
			}
			
			else if(dir==3)
			{
				for(int i=down;i>=top;i--)
				{
					s[count++]=m[i][left];
				}
				left+=1;
			}
			dir=(dir+1)%4;
			
		}
		
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = {{1,2,3},{6,9,8},{7,4,5}};
		convMatrixToArray(m);
	}

}
