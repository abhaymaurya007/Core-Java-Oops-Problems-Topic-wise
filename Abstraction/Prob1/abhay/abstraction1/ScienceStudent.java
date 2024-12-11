package Prob1.abhay.abstraction1;

public class ScienceStudent extends student {
	private int physicsMarks;
	private int chemistryMarks;
	private int   mathsMarks;
	
	public ScienceStudent(String studentName, String studentClass, int physicsMarks, int chemistryMarks,
			int mathsMarks) {
		super(studentName, studentClass);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	@Override
	public int getPercentage() {
		int totmark=this.chemistryMarks+this.mathsMarks+this.physicsMarks;
		return totmark/3;
	}

}
