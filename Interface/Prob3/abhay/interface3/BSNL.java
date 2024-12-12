package Prob3.abhay.interface3;

public class BSNL implements SIMCard{
	String Phonenumber;
	boolean active;
	public BSNL(String phonenumber) {
		super();
		Phonenumber = phonenumber;
		this.active = false;
	}
	@Override
	public String getPhoneNumber() {
		// TODO Auto-generated method stub
		return Phonenumber;
	}
	@Override
	public String NetworkProvider() {
		// TODO Auto-generated method stub
		return "BSNL";
	}
	@Override
	public void ActivateSim() {
		// TODO Auto-generated method stub
		active=true;
		System.out.println("BSNL Sim Card Activated");
		
	}
	@Override
	public void DeactivateSim() {
		// TODO Auto-generated method stub
		active=false;
		System.out.println("BSNL Sim Card Deactivated");
		
	}

	

}