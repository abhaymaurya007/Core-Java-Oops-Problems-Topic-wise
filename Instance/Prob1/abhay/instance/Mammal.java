package Prob1.abhay.instance;

public class Mammal extends Animal {
	boolean hasFur;

	public Mammal(String species, boolean hasFur) {
		super(species);
		this.hasFur = hasFur;
	}
	@Override
	public void makeSound() {
    	System.out.println("Mammal animal is making sound.");
    }
	public Mammal reproduce() {
    	System.out.println("Mammals give birth to live young.");
    	return new Mammal("Mammal",true);
    }
	public void nurseYoung() {
		System.out.println(" mammals nursing their young.");
	}

}
