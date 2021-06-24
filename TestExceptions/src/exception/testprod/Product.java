package exception.testprod;

public class Product {
	private int id;
	private float weight;
	private float price;
	static int i=0;
	
	Product()
	{
		id=++i;
	}
	
	Product(float weight,float price)
	{
		this();
		this.weight=weight;
		this.price=price;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", weight=" + weight + ", price=" + price + "]";
	}
	
	
	
	
}
