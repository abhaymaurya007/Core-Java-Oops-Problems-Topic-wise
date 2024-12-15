package Prob4.abhay.oops;

import java.util.Scanner;

public class bikedemo {
	public static void main(String []args) {
		BIKE r15=new BIKE();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter speed :");
		int speed=sc.nextInt();
		System.out.println("Enter name :");
		//sc.nextLine();
		String name=sc.next();
		System.out.println("Enter miledge :");
		double milege=sc.nextDouble();
		r15.setProductData(speed, name, milege);
		r15.getProductInfo();
		sc.close();
	}

}
