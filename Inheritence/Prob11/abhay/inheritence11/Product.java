package Prob11.abhay.inheritence11;

public class Product {
        protected String name;
        protected double price;
		public Product(String name, double price) {
			super();
			this.name = name;
			this.price = price;
		}
        public void displayInfo() {
        	System.out.println("name of product--"+this.name);
        	System.out.println("price of the product-- "+this.price);
        }
        public void Calculate(double quantity) {
        System.out.println("total price-"+(this.price*quantity));
        }
}
