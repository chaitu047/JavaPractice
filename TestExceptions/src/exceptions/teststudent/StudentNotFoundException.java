package exceptions.teststudent;

public class StudentNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	StudentNotFoundException()
	{
		super();
	}
	
	StudentNotFoundException(String s)
	{
		super(s);
	}
}
