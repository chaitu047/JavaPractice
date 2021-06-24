package javatutorial;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedInputStream bis = new BufferedInputStream(System.in);
		BufferedOutputStream bos = new BufferedOutputStream(System.out);
		int i=0,a=0;
		int[] b = new int[11];
		try{
			System.out.flush();
			while((a = bis.read())!='\n')
			{
				b[i]=a;
				i++;
			}
			bis.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try{
			bos.flush();
			i=0;
			while(i<b.length)
			{
			bos.write(b[i]);
			i++;
			}
			System.out.println("Executed");
			bos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
