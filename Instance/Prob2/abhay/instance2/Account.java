package Prob2.abhay.instance2;

public class Account {
	String accountNumber;
	double balance;
	public Account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account generateStatement() {
		System.out.println("account number is  :"+this.accountNumber);
		System.out.println("balance  :"+this.balance);
		return new Account("123456", 15000);
		
	}
	

}
