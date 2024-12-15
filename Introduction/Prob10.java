/*Program-10
-----------
A whole-seller gives incentives in the form of discounts on the net bill. Write a program to input the net bill and calculate the discount as follows:

     Net Bill in Rupees			    Discount %
	<5000					5
	>=5000 and <10000			10
	>=10000					15

Display Discount %, Discount Amount 
and Amount Payable*/
package introduction;

public class Prob10 {
	public static void main(String[] args) {
		double amount = 8000;
		double dic = 0;
		double discontamount = 0;
		double Amount = 0;
		if (amount < 5000) {
			dic = 5;
			discontamount = amount * 0.05;
			Amount = amount - discontamount;

		} else if (amount >= 5000 && amount < 10000) {
			dic = 10;
			discontamount = amount * 0.10;
			Amount = amount - discontamount;

		} else if (amount >= 10000) {
			dic = 15;
			discontamount = amount * 0.15;
			Amount = amount - discontamount;

		}
		System.out.println("Discount(%)--" + dic + "\nDiscount Amount--" + discontamount + "\nAmount----" + Amount);

	}

}
