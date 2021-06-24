package prcaticeCocubes;

public class ReverseOfNumberRecursion {

	static int bas_pos=1;
	static int rev_num=0;
	public static int reverse(int a)
	{
	/*	if(a>0)
		{
			reverse(a/10);
			rev_num+=bas_pos*(a%10);
			bas_pos*=10;
		}
		
		return(rev_num);
	*/
		if(a>0)
		{
			reverse(a/10);
			rev_num += bas_pos*(a%10);
			bas_pos*=10;
			
		}
		
		return(rev_num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(1234));
	}

}
