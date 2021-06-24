package filehandlingexamples;

public class Product{
	private int id;
	private float weight;
	private float cost;
	private int quantity;
	
	static int i=0;
	
	public Product()
	{
		id=++i;
	}
	
	public Product(float weight, float cost, int quantity) {
		this();
		this.weight = weight;
		this.cost = cost;
		this.quantity = quantity;
	}
	
	public Product(int id,float weight, float cost, int quantity) {
		this.id=id;
		this.weight = weight;
		this.cost = cost;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "id=" + id + ", weight=" + weight + ", cost=" + cost + ", quantity=" + quantity;
	}
	
}
