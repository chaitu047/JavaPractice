package collectionstest.product;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductSale sale = new ProductSale();
		
		sale.addProduct(new Product("Mixer",20,1000));
		sale.addProduct(new Product("Mixer",30,2000));
		sale.addProduct(new Product("Mixer",60,5000));
		sale.addProduct(new Product("Mixer",80,9000));
		sale.addProduct(new Product("Mixer",120,11000));
		sale.addProduct(new Product("Mixer",620,1000));
		sale.addProduct(new Product("Mixer",220,2000));
		sale.addProduct(new Product("Mixer",250,5000));
		sale.addProduct(new Product("Mixer",206,6000));
		sale.addProduct(new Product("Mixer",225,3000));
		sale.addProduct(new Product("Mixer",209,7000));
		
		System.out.println("__________________________________________________________");
		
		System.out.println(sale.getProduct());
		
		sale.remProdCost(11000);
		
		System.out.println("__________________________________________________________");
		
		System.out.println(sale.getProduct());
		
		System.out.println("__________________________________________________________");
		
		System.out.println(sale.getDuplicateProds());
	}

}
