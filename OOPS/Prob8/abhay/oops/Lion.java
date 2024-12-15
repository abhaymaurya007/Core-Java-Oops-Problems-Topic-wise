package Prob8.abhay.oops;

class Lion extends Animal{
	int maneLength;

	public Lion(String name, int age, int maneLength) {
		super(name, age);
		this.maneLength = maneLength;
	}
	public void makeSound() {
		System.out.println("The lion roars loudly.");
	}
	public void displayManeLength() {
		super.displayInfo();
		System.out.println("manelength is -"+this.maneLength);
		
	}	
}