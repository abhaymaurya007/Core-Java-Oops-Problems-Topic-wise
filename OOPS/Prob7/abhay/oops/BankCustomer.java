package Prob7.abhay.oops;

import java.util.Scanner;

public class BankCustomer {
	public static void main(String []args) {
		BANK pnb=new BANK();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your bank name :");
		String bank=sc.next();
		System.out.println("Enter your name :");
		String name=sc.next();
		System.out.println("enter addres :");
		String add=sc.next();
		System.out.println("enter ifsc code :");
		String ifsc=sc.next();
		System.out.println("enter your a/c numner");
		double acnum=sc.nextDouble();
		System.out.println("enter your current balance");
		double balance=sc.nextDouble();
		pnb.setDeatils( bank,name,add, ifsc, acnum,balance);
	     pnb.withdraw(4000);
		System.out.println("--------------------------------------------");
		pnb.deposit(1000);
	System.out.println("--------------------------------------------");
		pnb.currentBalance();
		System.out.println("--------------------------------------------");
         System.out.println(pnb.displayDetails());
  sc.close();
	}

}
