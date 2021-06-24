package fileinputestream;

import java.io.*;

public class FileInpStr {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream output = new FileOutputStream("output.txt");
		BufferedOutputStream bufferout = new BufferedOutputStream(output);
		FileInputStream input = new FileInputStream("input.txt");
		BufferedInputStream bufferin = new BufferedInputStream(input);
		int c = bufferin.read();
		bufferout.write(c);
		bufferin.close();
		bufferout.close();
		output.close();
		input.close();
	}

}
