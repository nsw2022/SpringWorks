package di_p;

public class Coffee{
	String name;
	int price;
	
	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + "]";
	}
	
}