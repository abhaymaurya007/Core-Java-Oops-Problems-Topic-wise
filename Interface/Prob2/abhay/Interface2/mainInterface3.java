package Prob2.abhay.Interface2;

public class mainInterface3 {
   public static void main(String[] args) {
	Employee e1=new FullTimeEmployee(345,"", 25000, 5000);
	e1.generatePayroll();
	System.out.println("Salary is  :"+e1.calculateSalary());
}
}
