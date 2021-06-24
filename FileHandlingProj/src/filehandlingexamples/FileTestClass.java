package filehandlingexamples;

import java.io.*;

public class FileTestClass {
	

	public static Product createProduct(String line)
	{
		String[] data = line.split(",");
		
		int id = Integer.parseInt(data[0]);
		float weight = Float.parseFloat(data[1]);
		float cost = Float.parseFloat(data[2]);
		int quant = Integer.parseInt(data[3]);
		
		return(new Product(id,weight,cost,quant));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader input = new FileReader("exceltest.csv");
		BufferedReader in = new BufferedReader(input);
		Product p = null;
		String line = in.readLine();
		System.out.println(line);
		line = in.readLine();
		while(line!=null)
		{
		p = createProduct(line);
		System.out.println(p);
		line = in.readLine();
		}
		in.close();
		input.close();
	}

}
