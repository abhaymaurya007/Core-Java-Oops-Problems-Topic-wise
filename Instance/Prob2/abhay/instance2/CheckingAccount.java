package Prob2.abhay.instance2;

public class CheckingAccount extends Account {
	double overdraftLimit;

	public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}
	@Override
	public  CheckingAccount generateStatement() {
		
		super.generateStatement();
		System.out.println("Overdraft limit is  :"+this.overdraftLimit);
		return new CheckingAccount("9999999",99999,999);		
	}
	@Override
	public String toString() {
		return "CheckingAccount [overdraftLimit=" + overdraftLimit + "]";
	}
	

}
