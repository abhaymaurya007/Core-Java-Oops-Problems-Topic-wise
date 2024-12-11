package Prob2.abhay.Interface2;

public class FullTimeEmployee implements Employee {
     private  int employeeId;
     private  String employeeName;
     private  double monthlySalary;
     private  double benefits;
	public FullTimeEmployee(int employeeId, String employeeName, double monthlySalary, double benefits) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.monthlySalary = monthlySalary;
		this.benefits = benefits;
	}
	@Override
	public double calculateSalary() {
if(employeeName.equals("")) {
			
			System.out.println("name can't be empty");
			return 0;
		}else {
		double salary=benefits+monthlySalary;
		return salary;}
	}
	@Override
	public void generatePayroll() {
if(employeeName.equals("")) {
			
			System.out.println("name can't be empty");
		}else {
		System.out.println("Employee id  :"+this.employeeId);
		System.out.println("Employee name  :"+this.employeeName);}
		
	}
     
}
