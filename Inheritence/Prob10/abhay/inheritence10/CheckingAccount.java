package Prob10.abhay.inheritence10;


public class CheckingAccount extends BankAccount {
	double overdraftLimit;

	public CheckingAccount(int accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}
	public void withdraw(double amount) {
		if(amount<=this.overdraftLimit && amount>0){
			this.balance=this.balance-amount;
			System.out.println("succesfully deposited");
			System.out.println("your tottal balance "+this.balance);}
			else 
				System.out.println("Exceeds overdraft limit.");
	}
	
}
