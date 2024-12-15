package Prob10.abhay.oops;

class Employee {
     String name;
     int id;
     double salary;
   
    
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}


	public double calculateSalary(){
        return this.salary;
    }
}