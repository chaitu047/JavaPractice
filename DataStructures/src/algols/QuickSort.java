package algols;

public class QuickSort {

	public static int partition(int[] a, int lb, int ub)
	{
		int pivot = a[lb];
		int start=lb, end=ub;
		
		while(start<=end)
		{
			
			while(a[start] <= pivot)
			{
				start++;
			}
			
			while(a[end]>pivot)
			{
				end--;
			}
			
			if(start<end)
			{
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
			
		}
		
		int temp = a[end];
		a[end] = pivot;
		a[lb] = temp;
		
		return end;
	}
	
	public static void quickSort(int[] a, int lb, int ub)
	{	
		
		if(lb<ub)
		{
			
			int loc = partition(a,lb,ub);
			quickSort(a,lb,loc-1);
			quickSort(a,loc+1,ub);
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {35,15,48,79,36,45,24,38,54};
		quickSort(a,0,a.length-1);
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
