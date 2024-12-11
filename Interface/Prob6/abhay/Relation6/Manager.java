package Prob6.abhay.Relation6;

public class Manager {
	  int  id;
      String name;
      double basicSalary,HRAer,DAPer,projectAllowance;
	public Manager(int id, String name, double basicSalary, double hRAer, double dAPer, double projectAllowance) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		HRAer = hRAer;
		DAPer = dAPer;
		this.projectAllowance = projectAllowance;
	}
	  public double calculateGrossSalary() {
     	 double Salary=basicSalary+HRAer+DAPer+projectAllowance;
     	 return Salary;
      }
}
