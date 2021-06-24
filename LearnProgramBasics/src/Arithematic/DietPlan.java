package Arithematic;

public class DietPlan {

	public static int dietConsumption(int a,int b,int c,int days)
	{
		
		if(days==1)
		{
			return a;
		}
		
		else if(days==2)
		{
			return b;
		}
		
		else if(days==3)
		{
			return c;
		}
		
		else
		{
			int temp = a+b+c;
			int d = 0;
			for(int i=0;i<days-3;i++)
			{
				d=a+b+c;
				a=b;
				b=c;
				c=d;
				temp+=d;
			}
			return temp;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(dietConsumption(1,2,3,4));
	}

}
