package javatpoint;

public class findSubsetsOfString {
	
	public static void printSubsets(String test)
	{
		int len = test.length();
		String arr[] = new String[len*(len+1)];
		
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				System.out.println(test.substring(i,j+1));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSubsets("Anagram");
	}

}
