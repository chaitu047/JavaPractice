package prcaticeCocubes;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,6,9,80,56,99,74,32,23,45,66,89};
		
		int max = a[0];
		int sec_max=Integer.MIN_VALUE;
		for(int i = 1;i < a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(sec_max<a[i] && a[i]!=max)
			{
				sec_max=a[i];
			}
		}
		
		System.out.println(sec_max);
	}

}
