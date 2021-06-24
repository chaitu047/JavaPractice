package collectionstest.product;

public class Product{
	private int id;
	private String name;
	private float weight;
	private float cost;
	
	static int i=0;
	
	Product()
	{
		id=++i;
	}
	
	Product(String name,float weight,float cost)
	{
		this();
		this.name=name;
		this.weight=weight;
		this.cost=cost;
	}
	
	Product(int id,String name,float weight,float cost)
	{
		this.id=id;
		this.name=name;
		this.weight=weight;
		this.cost=cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public float getCost() {
		return cost;
	}
	@Override
	public String toString() {
		return "id=" + id + "\n name=" + name + "\n weight=" + weight + "\n cost=" + cost+"\n";
	}

	/*@Override
	public int compareTo(Product p1) {
		// TODO Auto-generated method stub
		if(cost<p1.cost)
		{
			return(1);
		}
		if(cost>p1.cost)
		{
			return(-1);
		}
		return 0;
	}*/

}
