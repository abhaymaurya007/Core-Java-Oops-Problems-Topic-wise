package Prob10.abhay.inheritence10;

public class INHERIMAIN {
	  public static void main(String[]args) {
		  SavingAccount SA=new SavingAccount(123456, 20000, 3.5);
		  SA.deposite(5000);
		  SA.withdraw(5000);
		  SA.addInterest();
		  CheckingAccount CA =new CheckingAccount(123456,40000, 3000);
		  CA.withdraw(500);
		  
	  }
}
