package dictanagram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.*;

public class DictAnagram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader filein = new FileReader("sowpods.txt");
		BufferedReader in = new BufferedReader(filein);
		Map<String,TreeSet<String>> map = new LinkedHashMap<String,TreeSet<String>>();
		String temp = null;
		while((temp=in.readLine())!=null)
		{
			TreeSet<String> wordset = null;
			char[] ch = temp.toCharArray();
			Arrays.sort(ch);
			String key = new String(ch);
			if(map.containsKey(key))
			{
				wordset = map.get(key);
			}
			else
			{
				wordset = new TreeSet<String>();
			}
			wordset.add(temp);
			map.put(key, wordset);
		}
		in.close();
		filein.close();
		for(Map.Entry<String, TreeSet<String>> entry : map.entrySet())
		{
			if(entry.getValue().size()>=2)
				System.out.println(entry);
		}
	}

}
