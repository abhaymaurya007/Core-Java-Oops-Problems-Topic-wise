package Prob6.abhay.Relation6;

public class Sourcing {
	  int  id,enrollmentTarget,enrollmentReached;
      String name;
      double basicSalary,HRAer,DAPer,perkPerEnrollment;
	public Sourcing(int id, int enrollmentTarget, int enrollmentReached, String name, double basicSalary, double hRAer,
			double dAPer, double perkPerEnrollment) {
		super();
		this.id = id;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.name = name;
		this.basicSalary = basicSalary;
		HRAer = hRAer;
		DAPer = dAPer;
		this.perkPerEnrollment = perkPerEnrollment;
	}
	public double calculateGrossSalary() {
   	 double Salary=basicSalary+HRAer+DAPer+((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment;
   	 return Salary;
    }
}
