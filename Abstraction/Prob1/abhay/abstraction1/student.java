package Prob1.abhay.abstraction1;

public abstract class student {
	protected String studentName;
	protected String  studentClass;
	protected static int totalNoOfStudents;
  public abstract int getPercentage();
   public static int getTotalNoStudents() {
	   return totalNoOfStudents;
   }
   public student() {}
public student(String studentName, String studentClass) {
	super();
	this.studentName = studentName;
	this.studentClass = studentClass;
	++totalNoOfStudents;
};
   
  
} 
