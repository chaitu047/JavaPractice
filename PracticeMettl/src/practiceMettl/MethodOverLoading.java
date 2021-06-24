package practiceMettl;

public class MethodOverLoading {
	
	public static void fun(int x,int y)
	{
		System.out.println(x+" "+y+"1st");
	}
	
	public static void fun(long x,long y)
	{
		System.out.println(x+" "+y+"2st");
	}
	
	public static void fun(float x,float y)
	{
		System.out.println(x+" "+y+"3rd");
	}
	
	public static void fun(double x,double y)
	{
		System.out.println(x+" "+y+"4th");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(10,10);
		
		fun(10.0,20.0);
	}

}
