package practiceMettl;

public class StringComaprisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("abc");
		String s2 = s1;
		s1+="d";
		System.out.println(s1+ " " + s2 +" "+(s1==s2) );
	}

}
