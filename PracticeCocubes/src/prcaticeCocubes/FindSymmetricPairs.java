package prcaticeCocubes;

import java.util.HashMap;
import java.util.Map;

public class FindSymmetricPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2},{3,4},{5,6},{2,1},{4,3},{7,8},{9,10},{11,15},{10,9}};
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int first = a[i][0];
			int sec = a[i][1];
			
			Integer val = map.get(sec);
			
			if(val!=null && val==first)
			{
				System.out.println("("+sec+" , "+first+")");
			}
			else
			{
				map.put(first, sec);
			}
		}
		
	}

}
