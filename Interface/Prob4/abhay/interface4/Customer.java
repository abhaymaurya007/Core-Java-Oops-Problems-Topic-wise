package Prob4.abhay.interface4;

public class Customer {
   String name;
   
  
public Customer(String name) {
	super();
	this.name = name;
}
public void deposit(Bank b,double amount) {
	 
	   b.deposit(amount);
   }
   public void withdrawal(Bank b,double amount) {
	   b.Withdraw(amount);
   }
   public void CheckBalance(Bank b) {
	   b.CheckBalance();
   }
}
