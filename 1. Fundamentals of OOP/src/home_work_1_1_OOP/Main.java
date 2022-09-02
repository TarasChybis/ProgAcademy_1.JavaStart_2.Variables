//Create a custom class to describe a product (let's say it's a front for an online store). As product properties, you can use the price value, description, weight of the product. Create a couple of instances of your class and test them out.

package home_work_1_1_OOP;

public class Main {

	public static void main(String[] args) {

		Product send = new Product();
		send.setPrice(156.50);
		send.setType("river send");
		send.setWeight(200);

		Product steel = new Product(2000, "15HSND", 1500);

		System.out.println(send.getType());
		System.out.println(send.getPrice());
		System.out.println(send.getWeight());

		System.out.println(send);
		System.out.println(steel);

		System.out.println(send.total());
		System.out.printf(steel.total());
	}
}