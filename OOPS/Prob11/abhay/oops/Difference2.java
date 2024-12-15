package Prob11.abhay.oops;

import java.util.Scanner;

public class Difference2 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter only dogit num :");
		int k=sc.nextInt();
		int a=TwoDigitsDifference.getDiffofDegits(k);
		System.out.println(a);
		sc.close();
	}

}
