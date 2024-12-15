/*_______
QUE-12)
-----------
Write a java program to covert string to double using parseDouble() and multiply two Floating -point Numbers and display the result by taking input from the command line argument?*/
package introduction;

public class Prob12 {
	public static void main(String []args) {
		double value1 = Double.parseDouble(args[0]);
		double value2 = Double.parseDouble(args[1]);
		double value=value1*value2;
		System.out.println("multiple value is-"+value);
	}

}
