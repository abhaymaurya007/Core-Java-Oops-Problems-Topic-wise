package Prob4.abhay.abstraction4;

public abstract class Food {
	double proteins;
	double fats;
	double carbs;
	double tastyScore;
	double type;
	public Food(double proteins, double fats, double carbs, double tastyScore) {
		super();
		this.proteins = proteins;
		this.fats = fats;
		this.carbs = carbs;
		this.tastyScore = tastyScore;
	}

	public abstract void getMacroNutrients();
	public void getTaste() {
		System.out.println("TastyScore  :"+this.tastyScore);
	}
	public void getType() {
	   System.out.println("Type of food  :"+this.type);
	}
    
    
}
