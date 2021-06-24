package Arithematic;

public class ExtremeAndMinimum {
	
	static int Max,SecMax,Min,SecMin,MaxIndex,MinIndex;
	
	public static void Largest(int[] a)
	{
		int max = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max = a[i];
				MaxIndex=i;
			}
		}
		
		Max = max;
		//System.out.println(max);
		
	}
	
	public static void secondLargest(int[] a)
	{
		int secLarge = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(i==MaxIndex)
			{
				continue;
			}
			else if(secLarge<a[i])
			{
				secLarge = a[i];
			}
		}
		SecMax=secLarge;
	}
	
	public static void minimum(int[] a)
	{
		int min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min = a[i];
				MinIndex=i;
			}
		}
		
		Min = min;
		//System.out.println(min);
	}
	
	public static void secondMinimum(int[] a)
	{
		int secMinimum=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(i==MinIndex)
			{
				continue;
			}
			else if(secMinimum>a[i])
			{
				secMinimum = a[i];
			}
		}
		SecMin = secMinimum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,4,5,3,7,8,9,11,21,36,54,0,100};
		Largest(a);
		secondLargest(a);
		minimum(a);
		secondMinimum(a);
		System.out.println(Max+" "+SecMax+" "+Min+" "+SecMin);
	}

}
