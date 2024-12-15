
package Prob5.abhay.oops;

public class Employee {
	int salary;
	String name;
	double YOE;
	public void setemployeedata(int sal,String nam,double YoE) {
		salary=sal;
		name=nam;
		YOE=YoE;
		
	}
	public void getemployeedata() {
		System.out.println("Employee name is :"+name);
		System.out.println("salary is  :"+salary);
		System.out.println("Employye have "+YOE+" year of experince");
	}

}
