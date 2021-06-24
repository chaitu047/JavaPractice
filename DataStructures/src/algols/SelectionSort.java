package algols;

public class SelectionSort {
	
	static int[] a = {21,36,56,987,24,2000,1250,3692,15,63,255,125,325,875,546};
	
	public static void selectionSort(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			int minIndex=i;
			for(int j = i+1; j<a.length;j++)
			{
					if(a[minIndex]>a[j])
					{
						minIndex = j;
					}
			}
			
			if(a[minIndex]<a[i])
			{
				int temp = a[minIndex];
				a[minIndex] = a[i];
				a[i] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		selectionSort(a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
