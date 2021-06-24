package javatpoint;


public class MaxAndMinCharacter {

	public static void maxAndMinFrequency(String test)
	{
		char[] string = test.toCharArray();
		int min=1,max=1,minindex=0,maxindex=0;
		int[] freq = new int[test.length()];
		
		for(int i=0;i<string.length;i++)
		{
			freq[i]=1;
			for(int j=i+1;j<string.length;j++)
			{
				if(string[i]==string[j] && string[i]!='0')
				{
					freq[i]++;
					string[j]='0';
				}
			}
		}
		
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]<min)
			{
				min=freq[i];
				minindex=i;
			}
			if(freq[i]>max)
			{
				max=freq[i];
				maxindex=i;
			}
		}
		
		System.out.println(max+" "+string[maxindex]+"  "+min+" "+string[minindex]);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maxAndMinFrequency("aadcccbbbbbaaallllllkkkuuuuuuugggsss");
	}

}
