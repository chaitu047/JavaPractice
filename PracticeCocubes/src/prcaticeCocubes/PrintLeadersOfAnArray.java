package prcaticeCocubes;

public class PrintLeadersOfAnArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,6,3,9,8,17,62,5,4,9,7,3,2,1};
		
		/*for(int i=0;i<a.length;i++)
		{
			int j;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<=a[j])
				{
					break;
				}
			}
			if(j==a.length)
			{
				System.out.println(a[i]);
			}
		}*/
		//System.out.println(a[a.length-1]);
		
		for(int i=0;i<a.length;i++)
		{
			int j;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<=a[j])
				{
					break;
				}
			}
			if(j==a.length)
			{
				System.out.println(a[i]);
			}
		}
	}

}
