package algols;

public class BubbleSort {

	public static void bubbleSort(int a[])
	{
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1;j < a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;	
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,256,63,455,98,78,12,54,63,96,54,20,1,5,89,7,52,65,12,30};
		
		bubbleSort(a);
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i] + " ");
		}
		
		
	}

}
