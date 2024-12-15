package Prob8.abhay.oops;

class Elephant extends Animal{
	double tuskLength;

	public Elephant(String name, int age, double tuskLength) {
		super(name, age);
		this.tuskLength = tuskLength;
	}
	public void makeSound() {
		System.out.println("The elephant trumpets.");
	}
	public void displayTuskLength()
	{
		super.displayInfo();
		System.out.println("tuskLenth is--"+this.tuskLength);
	}	
}