/*Program-8
----------
Write a program to enter
 Principal, Rate and Time. Calculate and display Simple Interest and Amount.*/
package introduction;

public class Prob8 {
	public static void main(String[] args) {
		double principal = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		double time = Double.parseDouble(args[2]);
		double SI = (principal * rate * time) / 100;
		System.out.println("SI amount--" + SI);
		double tot = SI + principal;
		System.out.println("tot amount--" + tot);
	}

}
