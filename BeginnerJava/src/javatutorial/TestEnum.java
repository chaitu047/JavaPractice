package javatutorial;

public class TestEnum {
	enum Days
	{
		sunday,monday,tuesday,wednesday,thursday,friday,saturday
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Days d:Days.values())
		{
			if(d.equals(Days.tuesday))
			{
				System .out.println(d+"is a Holiday");
			}
			else
			{
				System .out.println(d);
			}
		}
	}

}
