package prcaticeCocubes;

public class DifferenceBetweenLargerElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a = {9,8,5,6,7,8,2,1,6,5};
		int a[] = {2, 3, 10, 6, 4, 8, 1 };
		
		int large_diff=a[1]-a[0];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]-a[i]>large_diff)
				{
					large_diff = a[j]-a[i];
				}
			}
		}
		System.out.println(large_diff);
	}

}
