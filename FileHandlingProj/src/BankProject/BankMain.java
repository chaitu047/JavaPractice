package BankProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BankMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BankCustomer bank = new BankCustomer("chaitu","chaitu097",2500);
		BankCustomer bank1 = new BankCustomer("cherry","cherry097",4500);
		BankCustomer bank2 = new BankCustomer("jack","jack097",6500);
		BankCustomer bank3 = new BankCustomer("jhones","jhones097",8500);
		BankCustomer bank4 = new BankCustomer("xyz","xyz097",9500);
		ArrayList<BankCustomer> list = new ArrayList<BankCustomer>();
		list.add(bank);
		list.add(bank1);
		list.add(bank2);
		list.add(bank3);
		list.add(bank4);
		for(BankCustomer cus : list)
		{
		FileReader read = new FileReader(cus.getUserId()+".txt");
		BufferedReader in = new BufferedReader(read);
		String[] data = in.readLine().split("/");
		System.out.println("User Name :"+data[0]+"Balance"+data[1]);
		in.close();
		read.close();
		}
	}

}
