package Prob9.abhay.oops;

class car extends Vehicle{
	int numDoors;

	public car(String brand, String model, int year, int numDoors) {
		super(brand, model, year);
		this.numDoors = numDoors;
	}
	public void carDetails() {
	super.displayInfo();
	System.out.println("numbers of doors in veh--"+this.numDoors);
	}
}