package algols;

public class InsertionSort {
	
	public static void insertionSort(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int temp = a[i]; //picking an element from unsorted array.
			int j = i-1;
			while(j>=0 && temp<=a[j])
			{
				a[j+1] = a[j]; //moving elements to corresponding positions.
				j--;
			}
			a[j+1] = temp; //placing the picked variable in sorted array.
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {123,56,789,45,324,565,987,125,635,456,1205,8796,1248};
		
		insertionSort(a);
		
		for(int i = 0; i < a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
