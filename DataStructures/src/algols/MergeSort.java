package algols;

public class MergeSort {

	public static void mergeSort(int a[],int beg, int end)
	{
		int mid;
		if(beg<end)
		{
			mid = (beg+end)/2;
			mergeSort(a,beg,mid);
			mergeSort(a,mid+1,end);
			merge(a,beg,mid,end);
			
		}
	}
	
	public static void merge(int[] a, int beg,int mid,int end)
	{
		int i = beg, j = mid+1, index = beg,k;
		int[] b = new int[end+1];
		while(i <= mid && j <= end)
		{
			if(a[i]<a[j])
			{
				b[index] = a[i];
				i++;
			}
			else
			{
				b[index] = a[j];
				j++;
			}
			index++;
		}
		
		if(i>mid)
		{
			while(j <= end)
			{
				b[index] = a[j];
				index++;
				j++;
			}
		}
		else
		{
			while(i <= mid)
			{
				b[index] = a[i];
				index++;
				i++;
			}
		}
		
		k = beg;  
		while(k<index)  
		{  
		    a[k]=b[k];  
		    k++;  
		}  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12,36,96,54,75,62,49,38,84,91};
		mergeSort(a,0,a.length-1);
		for(int i = 0; i < a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
