package Prob3.abhay.abstraction3;

public class Test extends Car {
	

	

	public Test(String brand, String model, int top_speed, int mileage, int yearOfManufacturing) {
		super(brand, model, top_speed, mileage, yearOfManufacturing);
	}

	@Override
	public void display() {
		System.out.println("Brand name--"+super.carBrand());
		System.out.println("model is  :"+super.carModel());
		System.out.println("top speed of car  :"+super.carTopSpeed());
		System.out.println("Year of manufacturing :"+super.yearOfManufacturing);
		System.out.println("miledge   :"+super.carMileage());
	

	}

}
