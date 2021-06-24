package printinginitials;

public class BinarySearchAlgo {
	public static int blockSearch(int[] arr,int item)
	{
		int n=arr.length;
		int m=(int)Math.sqrt(n);
		int i=0;
		while(arr[m]<=item && m<n)
		{
			i=m;
			m+=m;
			if(m>n-1)
				return(-1);
		}	
		for(int x=i;x<m;x++)
		{
			if(arr[x]==item)
			return(x);
		}
		return(-1);
	}
public static int binarySearch(int[] arr,int item)
	{
		int min=0;
		int max=arr.length-1;
		int mid=0;
		while(max>=min)
		{
			mid=(min+max)/2;
			if(arr[mid]==item)
			{
				return(mid);
			}
			else if(arr[mid]>item)
			{
				max=mid-1;
			}
			else
			{
				min=mid+1;
			}
		}
		return(-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,13,56,98,155,235,356,689,989,1532,2563,9654,10025};
		int index=blockSearch(arr,235);
		if(index==-1)
		{
			System.out.println("item is not present");
		}
		else
		{
			System.out.println("item is : "+index+" "+arr[index]);
		}

	}

}
