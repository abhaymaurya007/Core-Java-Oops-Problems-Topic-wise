package Prob4.abhay.abstraction4;

public class Egg extends Food {
       

	double tastyScore=7;
	String type="non vegiterian";
	public Egg(double proteins, double fats, double carbs, double tastyScore) {
		super(proteins, fats, carbs, tastyScore);
	}

	@Override
	public void getMacroNutrients() {
		System.out.println("An egg has"+this.proteins+" gms of proteind :"+this.proteins+"gms of fats :"+this.fats+"gms of carbs "+this.carbs);

	}
	@Override
	public void getTaste() {
		System.out.println("TastyScore  :"+this.tastyScore);
	}
	@Override
	public void getType() {
	   System.out.println("Type of food  :"+this.type);
	}

}
