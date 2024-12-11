package Prob1.abhay.abstraction1;

public class HistoryStudent extends student {
	private int historyMarks;
	private int civicsMarks;
	public HistoryStudent() {};    
	public HistoryStudent(String studentName, String studentClass, int historyMarks, int civicsMarks) {
		super(studentName, studentClass);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	@Override
	public int getPercentage() {
		int totmark=this.civicsMarks+this.historyMarks;
		return totmark/2;
	}

}
