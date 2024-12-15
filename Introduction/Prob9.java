/*Program-9
----------
Write a program in java to input number of days. Find and display number of years, months and days.*/
package introduction;

public class Prob9 {
	public static void main(String[] args) {
		int days = Integer.parseInt(args[0]);
		int years = days / 365;
		days = days % 365;
		int months = days / 30;
		days = days % 30;
		System.out.println("years--" + years + "\nmonths--" + months + "\ndays---" + days);
	}

}
