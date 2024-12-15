package Prob9.abhay.oops;


class Vehicle{
	String brand;
	String model;
	int year;
	public Vehicle(String brand, String model, int year) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	public void displayInfo() {
		System.out.println("brand of vehicle--"+this.brand);
		System.out.println("model of vehicle --"+this.model);
		System.out.println("year of manufacturing--"+this.year);
	}
}