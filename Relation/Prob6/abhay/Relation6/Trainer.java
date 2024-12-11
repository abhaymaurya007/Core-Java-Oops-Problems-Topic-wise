package Prob6.abhay.Relation6;

public class Trainer {
	 int  id,batchCount;
     String name;
     double basicSalary,HRAer,DAPer,perkPerBatch;
	public Trainer(int id, int batchCount, String name, double basicSalary, double hRAer, double dAPer,
			double perkPerBatch) {
		super();
		this.id = id;
		this.batchCount = batchCount;
		this.name = name;
		this.basicSalary = basicSalary;
		HRAer = hRAer;
		DAPer = dAPer;
		this.perkPerBatch = perkPerBatch;
	}
	public double calculateGrossSalary() {
    	 double Salary=basicSalary+HRAer+DAPer+(batchCount*perkPerBatch);
    	 return Salary;
     }
}
