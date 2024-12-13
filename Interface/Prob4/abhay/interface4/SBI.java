package Prob4.abhay.interface4;

public class SBI implements Bank{
  double balance;
  
  
	public SBI(double balance) {
	super();
	this.balance = balance;
}

	@Override
	public void deposit(double d) {
		// TODO Auto-generated method stub
		balance=balance+d;
		System.out.println(d+" rupees deposited");
		System.out.println("total balance :"+balance);
		
	}

	@Override
	public void Withdraw(double w) {
		// TODO Auto-generated method stub
		balance=balance-w;
		System.out.println(w+"rupees withdrawed");
		System.out.println("total balance :"+balance);
		
	}

	@Override
	public void CheckBalance() {
		// TODO Auto-generated method stub
		System.out.println("total balance :"+balance);
	}

	
	

}
