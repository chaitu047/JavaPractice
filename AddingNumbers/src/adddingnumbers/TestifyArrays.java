package adddingnumbers;

public class TestifyArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=i;
		}
		for(int j : arr)
		{
			System.out.println(j);
		}
	}

}
