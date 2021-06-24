package distbetpoints;

import java.io.*;
import java.util.*;

public class DistBetPoints {

	public static void printDistance(ArrayList<Point> p)
	{
		for(int i=0;i<p.size();i++)
		{
			for(int j=0;j<p.size();j++)
			{
				if(i==j)
				{
					continue;
				}
				else
				{
					System.out.println("Distance between "+p.get(i)+"and"+p.get(j)+"="+getDistance(p.get(i),p.get(j)));
				}
			}
		}
	}
	
	
	public static String getDistance(Point p1,Point p2)
	{
		double dist= Math.sqrt(Math.pow((p1.getX()-p2.getX()),2.0d)+Math.pow((p1.getY()-p2.getY()),2.0d));
		return(String.valueOf(dist));
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader input = new FileReader("exceltest.csv");
		BufferedReader in = new BufferedReader(input);
		ArrayList<Point> arr = new ArrayList<Point>();
		String line =in.readLine();
		line = in.readLine();
		while(line!=null)
		{
			String[] temp = line.split(",");
			arr.add(new Point(Float.parseFloat(temp[0]),Float.parseFloat(temp[1])));
			line=in.readLine();
		}
		
		printDistance(arr);
		in.close();
		input.close();
	}

}
