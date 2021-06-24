package javatpoint;

public class BinarySearch {
	
	public static int binarySearch(int[] a,int lb,int ub,int req)
	{
		if(lb<=ub)
		{
			int mid = (lb+ub)/2;
			if(req==a[mid])
			{
				return mid;
			}
			else
			{
				if(req>mid)
				{
					return binarySearch(a, mid+1, ub, req);
				}
				else
				{
					return binarySearch(a, lb, mid-1, req);
				}
			}
		}
		return -1;
	}
	
	public static int binarySearchLoop(int[] a,int req)
	{
		int lb=0,ub=a.length-1;
		while(lb<=ub)
		{
			int mid = (lb+ub)/2;
			if(a[mid]==req)
			{
				return mid;
			}
			else
			{
				//System.out.println(mid);
				if(req>a[mid])
				{
					lb=mid+1;
				}
				else
				{
					ub=mid-1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,21,36,54,98};
		//System.out.println(binarySearch(a, 0, a.length-1, 10));
		System.out.println(binarySearchLoop(a,9));
	}

}
