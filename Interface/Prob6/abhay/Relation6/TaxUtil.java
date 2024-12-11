package Prob6.abhay.Relation6;

public class TaxUtil {
	public double calculateTax(Employee x) {
		double salary = x.calculateGrossSalary();
		double tax = 0;
		if (salary >= 30000) 
			tax = (salary * 20 )/ 100;
		 else 
			tax = (salary * 5 )/ 100;
		return tax;
	}

	public  double calculateTax(Manager x) {
		double salary = x.calculateGrossSalary();
		double tax = 0;
		if (salary >= 30000) 
			tax =( salary * 20) / 100;
			else 
			tax = (salary * 5) / 100;
		return tax;
	}

	public  double calculateTax(Trainer x) {
		double salary = x.calculateGrossSalary();
		double tax = 0;
		if (salary >= 30000) 
			tax = ( salary * 20) / 100;
			 else
			tax = (salary * 5) / 100;
			return tax;
	}

	public  double calculateTax(Sourcing x) {
		double salary = x.calculateGrossSalary();
		double tax = 0;
		if (salary >= 30000)
			tax =( salary * 20) / 100;
			else
			tax = (salary * 5) / 100;
			

		return tax;
	}
}
