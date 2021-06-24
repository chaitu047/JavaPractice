package prcaticeCocubes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		String test = scan.nextLine();
		
		scan.close();
		
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<test.length();i++)
		{
			if(map.containsKey(test.charAt(i)))
			{
				map.put(test.charAt(i), map.get(test.charAt(i))+1);
			}
			else
			{
				map.put(test.charAt(i), 1);
			}
		}
		
		for(int i=0;i<map.size();i++)
		{
			if(map.get(test.charAt(i))==1)
			{
				System.out.print(test.charAt(i));
			}
		}
		
		/*String temp="";
		
		for(int i = 0; i<test.length();i++)
		{
			char current = test.charAt(i);
			
			if(temp.indexOf(current)==-1)
			{
				temp=temp+current;
			}
			else
			{
				temp=temp.replace(String.valueOf(current),"");
			}
		}
		
		System.out.println(temp);
		*/

	}

}
