package Prob2.abhay.instance2;

public class BankManagementSystem {
	public static void main(String[] args) {
		Account a1=new CheckingAccount("3455678",34000,2000);
		if(a1 instanceof SavingAccount) {
			a1.generateStatement();
		}
		else if(a1 instanceof CheckingAccount) {
			a1.generateStatement();
			//Account statement = a1.generateStatement();
			//System.out.println(statement);
		}
		
		
//		SavingAccount sa1=new SavingAccount("234456",12000,2000);
//		sa1.generateStatement();
//		CheckingAccount ca1=new CheckingAccount("3455678",34000,2000);
//		ca1.generateStatement();
	}

}
