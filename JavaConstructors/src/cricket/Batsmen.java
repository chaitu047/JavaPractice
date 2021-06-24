package cricket;

public class Batsmen extends Player { 
	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int ballsFaced;
	private int sixes;
	private int fours;
	
	Batsmen()
	{
		super();
	}
	
	Batsmen(String name,int runsScored,int centuries,int halfCenturies,int ballsFaced,int sixes,int fours)
	{
		super(name);
		this.runsScored=runsScored;
		this.centuries=centuries;
		this.halfCenturies=halfCenturies;
		this.ballsFaced=ballsFaced;
		this.sixes=sixes;
		this.fours=fours;
	}
	
	public void setRunsScored(int runsScored)
	{
		this.runsScored=runsScored;
	}
	
	public int getRunsScored()
	{
		return(this.runsScored);
	}
	
	public void setCenturies(int centuries)
	{
		this.centuries=centuries;
	}
	
	public int getCenturies()
	{
		return(this.centuries);
	}
	
	public int gethalfCenturies()
	{
		return(this.halfCenturies);
	}
	
	public void setBallsFaced(int ballsfaced)
	{
		this.ballsFaced=ballsfaced;
	}
	
	public int getBallsFaced()
	{
		return(this.ballsFaced);
	}
	
	public void setSixes(int sixes)
	{
		this.sixes=sixes;
	}
	
	public int getSixes()
	{
		return(this.sixes);
	}
	
	public void setFours(int fours)
	{
		this.fours=fours;
	}
	
	public int getFours()
	{
		return(this.fours);
	}
	
	public String getStrikeRate()
	{
		double strikerate = ((double)runsScored*100) / ballsFaced;
		return(String.valueOf(strikerate));
	}
	
	public int getRunsScoredInBoundaries()
	{
		int runs = 6*this.fours+4*this.fours;
		return(runs);
	}
	
	public String toString()
	{
		return("ID :"+this.getId()+"\n"+"Name :"+this.getName()+"\n"+"Runs Scored :"+this.runsScored+"\n"+"Centuries :"+this.centuries+"\n"+"Half Centuries :"+this.halfCenturies+"\n"+"Balls Faced :"+this.ballsFaced+"\n"+"Sixes :"+this.sixes+"\n"+"Fours :"+this.fours+"\n"+"Strike Rate :"+this.getStrikeRate()+"\n"+"Runs scored in Boundaries :"+this.getRunsScoredInBoundaries()+"\n");
	}
}
