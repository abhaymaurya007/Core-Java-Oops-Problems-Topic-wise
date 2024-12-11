package Prob1.abhay.instance;

public class Bird extends Animal {
        boolean canFly;

		public Bird(String species, boolean canFly) {
			super(species);
			this.canFly = canFly;
		}
		@Override
		public void makeSound() {
	    	System.out.println("Bird animal is making sound.");
	    }
		public Bird reproduce() {
	    	System.out.println("Birds lay eggs as a means of reproduction.");
	    	return new Bird("bird", true);
	    }
		public void buildNest() {
			System.out.println("birds building nests for their eggs.");
		}
		@Override
		public String toString() {
			return "Bird [canFly=" + canFly + "]";
		}
		
}
