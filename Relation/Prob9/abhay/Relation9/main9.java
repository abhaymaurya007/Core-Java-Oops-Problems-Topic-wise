package Prob9.abhay.Relation9;

public class main9 {
		public static void main(String[] args) {
					
			Payment p1=new CreditCardPayment();
			Payment  p2=new PayPal();
			Payment p3=new BankTransferPayment();
			processMultiplePayments(p1,p2,p3);
		}
		public static void processMultiplePayments(Payment... payments) {
			for(Payment p: payments)
			{
				p.processPayment();
			}
			
		}

}
