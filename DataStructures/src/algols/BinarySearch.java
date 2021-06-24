package algols;

public class BinarySearch {
	
	public static int binarySearchRec(int[] a,int start,int end,int req)
	{
		int mid;
		if(start <= end)
		{
			mid = (start+end)/2;
			
			if(a[mid]==req)
			{
				return mid;
			}
			
			if(a[mid]<req)
			{
				return binarySearchRec(a,mid+1,end,req);
			}
			else
			{
				return binarySearchRec(a,start,mid-1,req);
			}
		}
		else
		{
			return(-1);
		}
	}

	public static int binarySearch(int[] a,int start,int end,int req)
	{
		int mid;
		
		while(start<=end)
		{
			mid = (start+end)/2;
			
			if(a[mid]==req)
			{
				return mid;
			}
			
			if(a[mid]<req)
			{
				start = mid+1;
			}
			else
			{
				end = mid-1;
			}
		}
		return (-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
		int index = binarySearch(a,0,a.length-1,13);
		int indexRec = binarySearchRec(a,0,a.length-1,13);
		
		if(index!=-1)
		{
			System.out.println(index +" "+ a[index]);
		}
		else
		{
			System.out.println("not found");
		}
		
		if(indexRec!=-1)
		{
			System.out.println(index +" "+ a[indexRec]);
		}
		else
		{
			System.out.println("not found");
		}

	}

}
