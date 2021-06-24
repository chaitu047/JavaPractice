package prcaticeCocubes;

public class FindLargeAndSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,9,3,6,8,5,2,4,11,24,56,98,75,32,45,621,89};
		
		int largest, sec_largest, smallest,sec_smallest;
		
		largest = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(largest<a[i])
			{
				largest = a[i];
			}
		}
		
		System.out.println("Largest :"+largest);
		
		sec_largest = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(sec_largest<a[i] && a[i]!=largest)
			{
				sec_largest = a[i];
			}
		}
		
		System.out.println("second Largest :"+sec_largest);
		
		smallest = a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(smallest>a[i])
			{
				smallest = a[i];
			}
		}
		
		System.out.println("smallest :"+smallest);
		
		sec_smallest = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(sec_smallest > a[i] && a[i] !=smallest)
			{
				sec_smallest=a[i];
			}
		}
		
		System.out.println("second smallest :"+sec_smallest);
	}

}
