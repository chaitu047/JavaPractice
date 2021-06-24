package javatpoint;

public class ArmstrongNumber {

	public static void armstrongNum(int num)
	{
		int temp = num;
		int len=0;
		int res=0;
		while(temp!=0)
		{
			temp/=10;
			len++;
		}
		temp=num;
		while(temp!=0)
		{
			res += Math.pow(temp%10, len);
			temp/=10;
		}
		if(num==res)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrongNum(1643);
	}

}
