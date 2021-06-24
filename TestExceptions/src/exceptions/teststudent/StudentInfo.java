package exceptions.teststudent;

/*
 * "Create a class Product with id, weight , price as field
Create a list of 10 products ,if product weight < 200 throw an 
InvalidProductException and delete product from the list. DIsplay all valid products. 
(Use Iterator to traverse the list)"

 */
import java.util.*;

public class StudentInfo {
	private Map<Integer,Student> hashmap = new HashMap<Integer,Student>();
	public void insertStudent(Student obj)
	{
		hashmap.put(obj.getId(),obj);
	}
	
	public void checkInfo(int id) throws StudentNotFoundException
	{
		if(hashmap.containsKey(id))
		{
			System.out.println(id+" "+hashmap.get(id));
		}
		else
		{
				throw new StudentNotFoundException("Student details not present in list");
		}
	}
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		StudentInfo info = new StudentInfo();
		info.insertStudent(new Student("Jhon","USA"));
		info.insertStudent(new Student("Jack","AUS"));
		info.insertStudent(new Student("ABC","XYZ"));
		info.insertStudent(new Student("DEF","PRE"));
		info.insertStudent(new Student("GHI","JKL"));
		info.insertStudent(new Student("QRP","MNO"));
		info.insertStudent(new Student("STU","CDE"));
		info.insertStudent(new Student("GAS","OSR"));
		info.insertStudent(new Student("FGH","KLM"));
		info.insertStudent(new Student("DOc","COP"));
		System.out.println("Enter id to get student details");
		try {
			info.checkInfo(scan.nextInt());
		} catch (StudentNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		scan.close();
		
		
	}
}
