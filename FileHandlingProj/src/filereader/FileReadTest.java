package filereader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader in = new FileReader("exceltest.csv");
		BufferedReader buffin = new BufferedReader(in);
		FileWriter out = new FileWriter("output.txt");
		BufferedWriter buffout = new BufferedWriter(out);
		String line = buffin.readLine();
		while(line!=null)
		{
			out.write(line);
			line=buffin.readLine();
		}
		buffin.close();
		buffout.close();
		in.close();
		out.close();
	}

}
