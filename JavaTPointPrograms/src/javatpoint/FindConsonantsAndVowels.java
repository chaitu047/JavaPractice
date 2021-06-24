package javatpoint;

import java.util.ArrayList;
import java.util.List;

public class FindConsonantsAndVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int con = 0,vow=0;
		String test = "chaitu the great";
		List<String> vowlist = new ArrayList<String>();
		vowlist.add("a");
		vowlist.add("e");
		vowlist.add("i");
		vowlist.add("o");
		vowlist.add("u");
		
		for(int i=0;i<test.length();i++)
		{
			if(vowlist.contains(String.valueOf(test.charAt(i))))
			{
				vow++;
			}
			else if(test.charAt(i)!=' ')
			{
				con++;
			}
		}
		
		System.out.println("Vowels "+vow+" Consonants "+con);

	}

}
