/*Program-7
----------
Rohan purchased an old cycle for Rs. 1200 and 
spend Rs. 250 on repairs, Rs. 350 in coloring and 
added new accessories worth Rs. 500. Rohan wants to 
make a profit of Rs. 1500 on selling the cycle. Find 
the selling price of the cycle. Write a java program
 to store all values and calculate and display 
the selling price.*/
package introduction;

public class Prob7 {
	public static void main(String[] args) {
		int oldrate = 1200;
		int repairingcost = 250;
		int colouringcost = 350;
		int accessories = 500;
		int tot = oldrate + repairingcost + colouringcost + accessories + 1500;
		System.out.println("final selling price at marging of 1500 is--" + tot);
	}

}
