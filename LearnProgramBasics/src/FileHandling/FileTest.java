package FileHandling;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File readfile = new File("C:/Users/Chaitanya K/Desktop/read.txt");
		FileWriter fwrite = null;
		BufferedWriter buffwrite = null;
		PrintWriter printwrite = null;
		
		try 
		{
			
			fwrite = new FileWriter(readfile);
			buffwrite = new BufferedWriter(fwrite);
			printwrite = new PrintWriter(buffwrite);
			
		}
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
			
		} 
		catch (IOException e)
		{
			
			e.printStackTrace();
			
		}

		printwrite.println("Em ra CP");
		
		try 
		{
			
			buffwrite.close();
			fwrite.close();
			
		}
		catch (IOException e) {
			
			e.printStackTrace();
			
		}
		

	}

}