package Prob4.abhay.interface4;

public class Main4 {
	public static void main(String[] args) {
		SBI s1=new SBI(5000);
		HDFC h1=new HDFC(20000);
		ICICI i1=new ICICI(10000);
		Customer c1=new Customer("abhay");
		System.out.println("------------abhay SBI BANK-----");
		c1.withdrawal(s1, 2000);
		c1.deposit(s1, 2000);
		c1.CheckBalance(s1);
		System.out.println("------------abhay HDFC BANK-----");
		c1.withdrawal(h1, 2000);
		c1.deposit(h1, 2000);
		c1.CheckBalance(h1);
		System.out.println("--------abhay ICICI bank --------------");
		c1.withdrawal(i1, 2000);
		c1.deposit(i1, 2000);
		c1.CheckBalance(i1);
	}

}
