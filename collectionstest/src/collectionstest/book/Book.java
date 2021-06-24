package collectionstest.book;

public class Book implements Comparable<Book>{
	
	private int id;
	private String author;
	private String publisher;
	private double cost;
	static int i=0;
	Book()
	{
		this.id=++i;
	}
	Book(String author,String publisher,int cost)
	{
		this();
		this.author=author;
		this.publisher=publisher;
		this.cost=cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public String toString()
	{
		return("ID :"+String.valueOf(id)+"\n"+"AUTHOR :"+this.author+"\n"+"PUBLISHER :"+this.publisher+"\n"+"COST :"+String.valueOf(cost)+"\n");
	}
	@Override
	public int compareTo(Book b2) {
		// TODO Auto-generated method stub
		if(cost<b2.getCost())
		{
			return(-1);
		}
		if(cost>b2.getCost())
		{
			return(1);
		}
		return 0;
	}
	
}
