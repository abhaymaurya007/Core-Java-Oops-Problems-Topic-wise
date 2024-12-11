package Prob1.abhay.instance;

public class Animal {
      String species;

	public Animal(String species) {
		super();
		this.species = species;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
    public void makeSound() {
    	System.out.println("Genric animal is making sound.");
    }
    public Animal reproduce() {
    	System.out.println("Generic reproduction method for all animals.");
    	return new Animal("Genric");
    }

	@Override
	public String toString() {
		return "Animal [species=" + species + "]";
	}
    
}
