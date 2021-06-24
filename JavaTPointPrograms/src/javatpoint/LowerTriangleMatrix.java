package javatpoint;

public class LowerTriangleMatrix {
	
	public static void lowerTriangle()
	{
		int count=1;
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i>=j)
				{
					System.out.print(count++ + " ");
				}
				else
				{
					System.out.print("0 ");
				}
				
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lowerTriangle();
	}

}
