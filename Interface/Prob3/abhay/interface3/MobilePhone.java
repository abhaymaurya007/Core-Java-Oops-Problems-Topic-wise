package Prob3.abhay.interface3;

public class MobilePhone implements MobilePhoneInterface {
	SIMCard sim1;

	@Override
	public void insertSim(SIMCard s1) {
		// TODO Auto-generated method stub
		sim1=s1;
		sim1.ActivateSim();
		System.out.println(s1.NetworkProvider()+"Sim inserted");
		
	}

	@Override
	public void Remove() {
		// TODO Auto-generated method stub
		sim1.DeactivateSim();
		System.out.println(sim1.NetworkProvider()+" sim removed");
		
	}

	@Override
	public void makeCall(String s) {
		// TODO Auto-generated method stub
		System.out.println("Calling to  :+91"+s);
		
	}

	@Override
	public void makeMassage(String m1) {
		// TODO Auto-generated method stub
		System.out.println("Text Sended :"+m1);
	}
	

}
