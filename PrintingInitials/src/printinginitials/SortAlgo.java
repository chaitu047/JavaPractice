package printinginitials;

public class SortAlgo {
	public static int[] insertionSort(int[] arr)
	{
		int temp=0;
		for(int i=1;i<arr.length;i++)
		{
			int j=i;
			while(j>0 && arr[j-1]>arr[j])
			{
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
		}
		return(arr);
	}
	public static void mergeSort(int[] arr,int p,int r)
	{
		if(p<r)
		{
		int mid=(p+r)/2;
		mergeSort(arr,p,mid);
		mergeSort(arr,mid+1,r);
		sort(arr,p,r,mid);
		}
	}
	public static void sort(int[] arr,int start,int end,int q)
	{
		int[] b = new int[arr.length];
		int k=0;
		int p=start;
		int j=q+1;
		while(p<=q && j<=end)
		{
			if(arr[p]<=arr[j])
			{
				b[k]=arr[p];
				p++;
			}
			else
			{
				b[k]=arr[j];
				j++;
			}
			k++;
		}
		while(p<=q)
		{
			b[k]=arr[p];
			p++;
			k++;
		}
		while(j<=end)
		{
			b[k]=arr[j];
			j++;
			k++;
		}
		for(int i=end;i>=start;i--)
		{
			arr[i]=b[--k];
		}

	}
	public static void quickSort(int[] arr,int start,int end)
	{
		if(start<end)
		{
			int loc=partition(arr,start,end);
			quickSort(arr,start,loc-1);
			quickSort(arr,loc+1,end);
		}
	}
	public static int partition(int[] items, int startIndex, int endIndex) 
	{
        int left = startIndex;
        int right = endIndex;
        int pivot = items[startIndex];

        while (left <= right) 
        {
            while (left <= right && items[left] <= pivot) {
                ++left;
            }
            while (left <= right && items[right] >= pivot) {
                --right;
            }
            if (left < right) {
                int temp_item = items[left];
                items[left] = items[right];
                items[right] = temp_item;
            }
        }

        //swap pivot to the new position

            int temp_item = items[right];
            items[right] = pivot;
            items[startIndex] = temp_item;

        return right;
    }
	public static int[] selectedSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int min=arr[i],pos=i,temp=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(min>arr[j])
				{
					min=arr[j];
					pos=j;
				}
			}
			temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
		}
		return(arr);
	}
	
	public static int[] bubbleSort(int[] arr)
	{
		int length=arr.length;
		int temp=0;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,56,32,98,45,32,74,62,13,85,54};
		quickSort(arr,0,arr.length-1);
		for(int i : arr)
		{
			System.out.println(i+" ");
		}
	}

}
