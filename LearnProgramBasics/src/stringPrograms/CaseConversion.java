package stringPrograms;

public class CaseConversion {
	
	public static String caseConVice(String str)
	{
		char[] ch = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>=65 && ch[i]<=97)
			{
				ch[i]=(char)(ch[i]+32);
			}
			else
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		
		return new String(ch);
	}
	
	public static String caseConv(String str)
	{
		StringBuilder strconv = new StringBuilder("");
		char ch[] = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(ch[i]))
			{
				strconv.append(Character.toUpperCase(ch[i]));
			}
			else
			{
				strconv.append(Character.toLowerCase(ch[i]));
			}
		}
		return String.valueOf(strconv);
	}

	public static void main(String[] args) {
		
		System.out.println(caseConv("This is My test"));
		System.out.println(caseConVice("This is My test"));
	}

}
