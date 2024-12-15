package Prob10.abhay.oops;

class Manager extends Employee {
    double ta;
    double foodAllowance;
 
  public Manager(String name, int id, double salary, double ta, double foodAllowance) {
		super(name, id, salary);
		this.ta = ta;
		this.foodAllowance = foodAllowance;
	}

	public double calculateSalary(){
     return this.salary+this.foodAllowance+this.ta;
 }
}