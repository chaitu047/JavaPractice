package prcaticeCocubes;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9,10,11};
		int mid = a.length/2;
		/*if(a.length%2==0)
		{*/
			
			for(int i=0;i<=mid;i++)
			{
				int temp = a[i];
				a[i]=a[a.length-1-i];
				a[a.length-1-i]=temp;
			}
		//}
		/*else
		{
			for(int i=0;i<=mid;i++)
			{
				int temp = a[i];
				a[i]=a[a.length-1-i];
				a[a.length-1-i]=temp;
			}
		}*/
		for(int i : a)
		{
			System.out.println(i);
		}
	}

}
