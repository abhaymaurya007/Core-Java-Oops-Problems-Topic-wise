package Prob10.abhay.oops;

class Developer extends Employee  {
    double hra;
   
    public Developer(String name, int id, double salary, double hra) {
		super(name, id, salary);
		this.hra = hra;
	}

	public double calculateSalary(){
       return this.salary+this.hra;
   }
}