/*Program 05 :
-------------
Write a program in java to Fahrenheit to Celsius Program
Formula is :-  celsius=((fahrenheit-32)*5)/9;*/
package introduction;

public class Prob5 {
	public static void main(String []args) {
		double fohre = Double.parseDouble(args[0]);
		double cel=((fohre-32)*5)/9;
		System.out.println(fohre+"  fohrenhite in celsious is"+cel);
	}

}
