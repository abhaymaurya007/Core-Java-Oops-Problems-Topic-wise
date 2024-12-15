/*Program-6
-----------
A shopkeeper buys a TV set for Rs. 32,500 and 
sells it at a profit of 27%. Apart from this a VAT 
of 12.7% and Service Charge is 3.87% is charged.
 Display total selling price, profit along
 with vat and service charge.*/
package introduction;

public class Prob6 {
	public static void main(String[] args) {
		double TVRealAmount = 32500;
		double profit = TVRealAmount * 0.27;
		double VAT = (profit + TVRealAmount) * 0.127;
		double ServiceTax = (profit + TVRealAmount) * 0.0387;
		double SellingPrice = TVRealAmount + profit + VAT + ServiceTax;
		double x = VAT + ServiceTax;
		double Margin = SellingPrice - x - TVRealAmount;
		System.out.println("Selling price--" + SellingPrice);
		System.out.println("profit--" + Margin);
		System.out.println("profit--" + profit);

	}

}
