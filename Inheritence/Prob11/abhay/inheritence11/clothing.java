package Prob11.abhay.inheritence11;

public class clothing extends Product {
	private String size;

	public clothing(String name, double price, String size) {
		super(name, price);
		this.size = size;
	}
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("size of product is--"+this.size);
	}
}
