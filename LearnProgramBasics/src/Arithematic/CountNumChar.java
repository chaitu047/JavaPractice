package Arithematic;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountNumChar {
	
	public static void countNumbersMap(int[] a)
	{
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i])+1);
			}
			else
			{
				map.put(a[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+"frequency"+entry.getValue());
		}
	}
	
	public static void countNumbers(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			if(a[i]==-1)
			{
				continue;
			}
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=-1;
				}
			}
			if(a[i]!=-1)
			{
			System.out.println(a[i]+"frequency"+count);
			}
		}
	}

	public static void main(String[] args) {
		int a[] = {1,2,5,4,6,78,95,32,14,2,3,4,1,78,35,1,3,4,2,9,95,87,45,78,1,2,4,5,32};
		countNumbers(a);
		System.out.println("________________________________________________________");
		countNumbersMap(a);
	}

}
