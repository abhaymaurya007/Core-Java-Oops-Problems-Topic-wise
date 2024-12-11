package Prob6.abhay.Relation6;

public class Employee {
         int  id;
         String name;
         double basicSalary,HRAer,DAPer;
         public Employee( int  id,String name
         ,double basicSalary,double HRAer, double DAPer) {
        	 super();
        	 this.id=id;
        	 this.name=name;
        	 this.basicSalary=basicSalary;
        	 this.HRAer=HRAer;
        	 this.DAPer=DAPer;
         }
         public double calculateGrossSalary() {
        	 double Salary=basicSalary+HRAer+DAPer;
        	 return Salary;
         }
}
