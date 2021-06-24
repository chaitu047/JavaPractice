package javatutorial;

public class PrintPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=6;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=1;i<=7;i++)
		{
			for(int j=7;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=7;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<7;i++)
		{
			for(int j=7-i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=7;i>=1;i--)
		{
			for(int j=7;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=7;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=7;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		for(int i=7;i>1;i--)
		{
			for(int j=1;j<i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=i-1;k<=7;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=7;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(((j%2!=0)?1:0));
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=7;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7-i;j++)
			{
				System.out.print(1);
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				System.out.print((i%2!=0)?((j%2!=0)?1:0):((j%2!=0)?0:1));
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int j=1,k=i;j<=i;j++)
			{
				System.out.print(k+" ");
				k+=5-j;
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=7;i++)
		{
			for(int j=7,k=1;j>=i;j--,k++)
			{
				System.out.print(k);
			}
			for(int m=1;m<i;m++)
			{
				System.out.print(m);
			}
			System.out.println();
		}
		System.out.println();
		int value=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(value+" ");
				value++;
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<10;i+=2)
		{
			for(int j=10-i;j>1;j-=2)
			{
				System.out.print(" ");
				
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
