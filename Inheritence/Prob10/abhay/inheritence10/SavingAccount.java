package Prob10.abhay.inheritence10;

public class SavingAccount extends BankAccount {
	double interestRate;

	public SavingAccount(int accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	public void addInterest() {
		
		this.balance=this.balance+((this.balance*this.interestRate*12)/1000);
		System.out.println("after interesr balance="+this.balance);
		
	}

}
