package javatutorial;

public class PermuationOfStrings {
	
	public static void permutations(String prefix,String name)
	{
		if(name.length()==0)
		{
			System.out.println(prefix);
		}
		for(int i=0;i<name.length();i++)
		{
			permutations(prefix+name.charAt(i),name.substring(0,i)+name.substring(i+1));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutations("","ab");
	}

}
