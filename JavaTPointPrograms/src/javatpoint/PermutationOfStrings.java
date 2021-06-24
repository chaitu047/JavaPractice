package javatpoint;

import java.util.LinkedHashSet;
import java.util.Set;

public class PermutationOfStrings {
	
	static Set<String> set = new LinkedHashSet<String>();
	
	public static void permutation(String test,String res)
	{
		if(test.length()==0)
		{
			set.add(res);
			return;
		}
		else
		{
			for(int i=0;i<test.length();i++)
			{
				char ch = test.charAt(i);
				
				String ros = test.substring(0,i)+test.substring(i+1);
				
				permutation(ros, res+ch);
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("abcdeff", "");
		System.out.println(set.size());
	}

}
