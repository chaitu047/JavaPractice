package Arithematic;

public class Sort {
	
	public static void selectionSort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int min = a[i],min_index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(min>=a[j])
				{
					min = a[j];
					min_index=j;
				}
			}
			int temp = a[min_index];
			a[min_index] = a[i];
			a[i] = temp;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void insertionSort(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int temp = a[i];
			int j = i-1;
			while(j>=0 && temp<=a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void mergeSort(int[] a,int lb,int ub)
	{
		if(lb<ub)
		{
			int mid = (lb+ub)/2;
			mergeSort(a,lb,mid);
			mergeSort(a,mid+1,ub);
			sort(a,lb,mid,ub);
			
		}
	}
	
	public static void sort(int[] a,int lb,int mid,int ub)
	{
		int i=lb,j=mid+1,index=lb,k=lb;
		int[] b = new int[ub+1];
		
		while(i<=mid && j<=ub)
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
			while(j<=ub)
			{
				b[index++]=a[j];
				j++;
			}
		}
		else
		{
			while(i<=mid)
			{
				b[index++]=a[i];
				i++;
			}
		}
		
		while(k<=ub)
		{
			a[k]=b[k];
			k++;
		}
		
	}
	
	public static void bubbleSort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[j];
					a[j] = a[i];
					a[i]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	

	public static void main(String[] args) {
		
		int[] a = {1,5,3,9,7,21,12,15,13};
		//bubbleSort(a);
		//selectionSort(a);
		//mergeSort(a,0,a.length-1);
		insertionSort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
