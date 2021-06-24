package exception.testprod;

public class InvalidProductException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidProductException()
	{
		super();
	}
	
	InvalidProductException(String s)
	{
		super(s);
	}
	
}
