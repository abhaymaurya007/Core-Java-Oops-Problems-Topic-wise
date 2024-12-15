package Prob9.abhay.oops;

class ElectricCar extends car{
	int batteryCapacity;

	public ElectricCar(String brand, String model, int year, int numDoors, int batteryCapacity) {
		super(brand, model, year, numDoors);
		this.batteryCapacity = batteryCapacity;
	}
	public void ElectricCardetails() {
	super.carDetails();
	System.out.println("bateer capacity is-"+this.batteryCapacity+"kwh");
}}