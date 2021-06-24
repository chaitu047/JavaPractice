package javatutorial;


public class StringExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"Madras","Ahmedabad","Mumbai","Gujarat","Vizag","London","Bombay","Cathedral","0012","0123","25635","9844"};
		StringBuffer astr = new StringBuffer("Hello world");
		String str1 =String.valueOf(astr);
		int size = str.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					String temp = str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		for(String st : str)
		{
			
			System.out.println(st);
		}
		System.out.println(str1);
	}

}
