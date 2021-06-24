package cricket;

public class Bowler extends Player {
	
	private int ballsBowled;
	private int runsLeaked;
	private int wickets;
	
	Bowler()
	{
		super();
	}
	
	Bowler(String name,int ballsbowled,int runsleaked,int wickets)
	{
		super(name);
		this.ballsBowled=ballsbowled;
		this.runsLeaked=runsleaked;
		this.wickets=wickets;
	}
	
	public void setBallsBowled(int ballsbowled)
	{
		this.ballsBowled=ballsbowled;
	}
	
	public int getBallsBowled()
	{
		return(this.ballsBowled);
	}
	
	public void setRunsLeaked(int runsleaked)
	{
		this.runsLeaked=runsleaked;
	}
	
	public int getRunsLeaked()
	{
		return(this.runsLeaked);
	}
	
	public void setWickets(int wickets)
	{
		this.wickets=wickets;
	}
	
	public int getWickets()
	{
		return(this.wickets);
	}
	
	public String calculateStrikeRate()
	{
		double rate=(double)this.ballsBowled/this.wickets;
		return(String.valueOf(rate));
	}
	
	public String toString()
	{
		return("ID :"+this.getId()+"\n"+"Name :"+this.getName()+"\n"+"Balls Bowled :"+this.ballsBowled+"\n"+"Runs Leaked :"+this.runsLeaked+"\n"+"Wickets :"+this.wickets+"\n"+"Strike Rate :"+this.calculateStrikeRate()+"\n");
	}
	

}
