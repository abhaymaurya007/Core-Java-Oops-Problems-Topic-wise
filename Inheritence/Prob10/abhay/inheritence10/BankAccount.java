package Prob10.abhay.inheritence10;

public class BankAccount {
	int accountNumber;
	double balance;
	public BankAccount(int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void deposite(double amount) {
		if(amount>0) {
		this.balance=amount+this.balance;
		System.out.println("succesfully deposited");
		System.out.println("your tottal balance "+this.balance);}
		else 
			System.out.println("invalid amount");
		
	}
   public void withdraw(double amount) {
	   if(this.balance>=amount) {
		   this.balance=this.balance-amount;
		   System.out.println(" withdraw succesfull");
		   System.out.println("your tottal balance "+this.balance);
	   }
	   else
		   System.out.println("invalid amount");
   }
}
