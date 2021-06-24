package javatpoint;

public class SortTechniques {

	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}
	}

	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = a[i], minIndex = i;

			for (int j = i; j < a.length; j++) {
				if (a[j] < min) {
					min = a[j];
					minIndex = j;
				}
			}

			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int j = i - 1, temp = a[i];
			while (j >= 0 && a[j] > temp) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	public static int binarySearch(int[] a, int req) {
		int lb = 0, ub = a.length - 1;

		while (lb <= ub) {
			int mid = (lb + ub) / 2;

			if (req == a[mid]) {
				return mid;
			} else if (req > a[mid]) {
				lb = mid + 1;
			} else {
				ub = mid - 1;
			}
		}

		return -1;
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
		
		if(i<=mid)
		{
			while(i<=mid)
			{
				b[index++]=a[i];
				i++;
			}
			
		}
		else
		{
			while(j<=ub)
			{
				b[index++]=a[j];
				j++;
			}
		}
		
		while(k<=ub)
		{
			a[k]=b[k];
			k++;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 0, 2, 4, 3, 9, 5, 8, 7 };
		// bubbleSort(a);
		// selectionSort(a);
		// insertionSort(a);
		// System.out.println("Index of req"+4+" "+binarySearch(a, 4));
		mergeSort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
