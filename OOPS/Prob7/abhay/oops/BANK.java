
package Prob7.abhay.oops;

public class BANK {
	String bankname;
	String bankCustomerName;
	String bankAddress;
	String bankIFSCCode;
	double customerAccountNumber;
	double currentBalance;
	public void setDeatils(String bankname,String bankCustomerName,
			String bankAddress,String bankIFSCCode,double customerAccountNumber,double currentBalance) {
		this.bankname= bankname;
          this.bankCustomerName=bankCustomerName;
            this.bankAddress=bankAddress;
           this.bankIFSCCode=bankIFSCCode;
           this.customerAccountNumber=customerAccountNumber;
           this.currentBalance=currentBalance;
	}
	public void withdraw (double amount) {
	if(currentBalance>=1000) {
		double com=currentBalance-amount;
		if(com>=1000) {
			System.out.println(" withdrawal Transaction Successful");
	  System.out.println("Available Balance : Rs."+com);
	  currentBalance=com;
		}
		else
		{
			System.out.println("Maintain MinimumBalance");}
	}
	else 
		{System.out.println("InsufficientBalance");}}
	
	public  void deposit(double amt ) {
		if(currentBalance>=1000) {
			System.out.println("");
		}
		else
		{ System.out.println("minimum balance to be maintained");}
		currentBalance=(currentBalance+amt);
		System.out.println("Deposited Successfully :Rs."+currentBalance);
		
		}
	public void currentBalance() {
		System.out.println("current balancr is Rs."+currentBalance);
	}
//	public void displayDetails() {
//		System.out.println("Bank Name is :"+bankname);
//		System.out.println("bankCustomerName is :"+bankCustomerName);
//		System.out.println("bankAddress is :"+bankAddress);
//		System.out.println("bankIFSCCode is :"+bankIFSCCode);
//		System.out.println("customerAccountNumberis :"+customerAccountNumber);
//		System.out.println("currentBalance is :"+currentBalance);
//	}
	public  String displayDetails() {
		return "BANK [bankname=" + bankname + ", bankCustomerName=" + bankCustomerName + ", bankAddress=" + bankAddress
				+ ", bankIFSCCode=" + bankIFSCCode + ", customerAccountNumber=" + customerAccountNumber
				+ ", currentBalance=" + currentBalance + "]";
	}
	
	}
	


