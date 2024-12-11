package Prob6.abhay.Relation6;

public class mainHAs6 {
         public static void main(String[] args) {
        	 TaxUtil t1=new TaxUtil();
        	 System.out.println("---------------------------------------------------------------------------------------");
        	Employee e1=new Employee(345, "abhay", 30000, 5000, 5000);
			System.out.println("name of employee--"+e1.name);
			System.out.println("salary without tax--"+e1.calculateGrossSalary());
			System.out.println("tax  :"+t1.calculateTax(e1));
			
			
			System.out.println("---------------------------------------------------------------------------------------");
			Manager m1=new Manager(111,"raju",40000,1000,1000,1000);
			System.out.println("name of manager  :"+m1.name);
			System.out.println("salary without tax  :"+m1.calculateGrossSalary());
			System.out.println(" tax  :"+t1.calculateTax(m1));
			
			
			System.out.println("---------------------------------------------------------------------------------------");
			Trainer t11=new Trainer(111, 10, "anuj",20000,2000,2000,1000);
			System.out.println("name of trainer  :"+t11.name);
			System.out.println("salary without tax  :"+t11.calculateGrossSalary());
			System.out.println("tax--------"+t1.calculateTax(t11));
			
			
			System.out.println("---------------------------------------------------------------------------------------");
			Sourcing s1=new Sourcing(112, 10, 8, "rani",20000,5000,500,2000);
			System.out.println("name of sourcer  :"+s1.name);
			System.out.println("salary without tax  :"+s1.calculateGrossSalary());
			System.out.println("salary after tax  :"+t1.calculateTax(s1));
		}
}
