package Prob5.abhay.oops;

import java.util.Scanner;

public class Employeedemo {
	public static void main(String []args) {
		Employee abhi=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter emplouee salary :");
		int a=sc.nextInt();
		System.out.println("enter name :");
		String b=sc.next();
		System.out.println("enter year of exp :");
		double c=sc.nextDouble();
		abhi.setemployeedata(a, b, c);
		abhi.getemployeedata();
		sc.close();	
	}
     

}
