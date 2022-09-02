package home_work_1_1_OOP;

public class Product {

	private double price;
	private String type;
	private int weight;

	public Product(double price, String type, int weight) {
		super();
		this.price = price;
		this.type = type;
		this.weight = weight;
	}

	public Product() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String total() {
		double a = price * weight;
		String total = String.format("%.2f", a);
		return total;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", type=" + type + ", weight=" + weight + "]";
	}
}