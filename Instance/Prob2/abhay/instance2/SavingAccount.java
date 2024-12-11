package Prob2.abhay.instance2;

public class SavingAccount extends Account {
	double interestRate;

	public SavingAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	@Override
	public SavingAccount generateStatement() {
		System.out.println("account number is  :"+this.accountNumber);
		System.out.println("balance  :"+this.balance);
		return new SavingAccount("123456",30000,3.2);
		
		
	}

}
