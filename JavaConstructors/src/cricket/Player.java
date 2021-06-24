package cricket;

public class Player {
	private int id ;
	private String name;
	static int i=0;
	
	Player()
	{
		id=++i;
	}
	
	Player(String name)
	{
		this();
		this.name=name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return(this.name);
	}
	
	public int getId()
	{
		return(this.id);
	}
	
	public String toString()
	{
		return("ID:"+this.id+"\n"+"Name:"+this.name+"\n");
	}
}
