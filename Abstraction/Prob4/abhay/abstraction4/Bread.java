package Prob4.abhay.abstraction4;

public class Bread extends Food {
    String type="vegitarian";
   
	public Bread(double proteins, double fats, double carbs, double tastyScore) {
		super(proteins, fats, carbs, tastyScore);
	}

	@Override
	public void getMacroNutrients() {
		System.out.println("An bread has"+this.proteins+" gms of proteind :"+this.proteins+"gms of fats :"+this.fats+"gms of carbs "+this.carbs);

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
