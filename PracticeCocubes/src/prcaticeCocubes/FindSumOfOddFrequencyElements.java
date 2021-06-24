package prcaticeCocubes;

import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;
import java.util.Set;

public class FindSumOfOddFrequencyElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		int[] a = {1,1,5,5,5,5,5,60,60,60,24,24,30,30,30,30,30,85,85,85,90,90};
		int sum=0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
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
		
		Set<Integer> key = map.keySet();
		
		for(Integer i : key)
		{
			if(map.get(i)%2!=0)
			{
				sum+=i;
			}
		}
		
		System.out.println(sum);
	}

}
