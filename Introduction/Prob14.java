/*Write a java program to find the profit and loss by following the formula
Profit and loss Formulas – 
Profit = SP – CP
Loss = CP – SP
Profit percentage = (Profit /Cost Price) x 100
Loss percentage = (Loss / Cost price) x 100*/
package introduction;
public class Prob14 {
	public static void main(String []args) {
		double SP=15000;
		double CP=8000;
		double profit=SP-CP,loss=CP-SP;
		double profitPercentage=(profit/CP)*100;
		double lossPercentage=(loss/CP)*100;
	if(CP>SP) {
		System.out.println("loss---:"+loss);
		System.out.println("loss percentage---:"+lossPercentage);}
	else if(CP==SP)
	{
		System.out.println("nor profit not loss");
	}
	else {
		System.out.println("profit---"+profit);
		System.out.println("profit percentage---"+profitPercentage);}
	}}
