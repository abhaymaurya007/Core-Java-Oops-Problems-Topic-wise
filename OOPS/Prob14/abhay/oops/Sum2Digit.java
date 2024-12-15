package Prob14.abhay.oops;
import java.util.Scanner;

public class Sum2Digit {
public static void main (String []args) {
	Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
int p=sc.nextInt();
int c=TeoDigitSum.getSumOfDigits(p);
System.out.print(c);
sc.close();
	
}
}
