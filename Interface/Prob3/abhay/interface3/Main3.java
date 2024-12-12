package Prob3.abhay.interface3;

public class Main3 {
	public static void main(String[] args) {
		SIMCard s1=new AIRTEL("8787254567");
		MobilePhoneInterface m=new MobilePhone();
		m.insertSim(s1);
		m.makeCall("9712245678");
		m.makeMassage("welcome to my home");
		m.Remove();
	}
	

}
