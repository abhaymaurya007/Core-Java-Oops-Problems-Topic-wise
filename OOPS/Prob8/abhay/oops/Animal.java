package Prob8.abhay.oops;

class Animal{
	String name;
	int age;
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void makeSound() {
		System.out.println("The animal makes a generic sound");
	}
	public void displayInfo() {
		System.out.println("NAME OF THE ANIMAL--"+this.name);
		System.out.println("age of the anuimqal-"+this.age);
	}
}