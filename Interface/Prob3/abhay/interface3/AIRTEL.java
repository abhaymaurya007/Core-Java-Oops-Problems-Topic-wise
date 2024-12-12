package Prob3.abhay.interface3;

public class AIRTEL implements SIMCard{
	String Phonenumber;
	boolean active;
	public AIRTEL(String phonenumber) {
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
		return "AIRTEL";
	}
	@Override
	public void ActivateSim() {
		// TODO Auto-generated method stub
		active=true;
		System.out.println("AIRTEL Sim Card Activated");
		
	}
	@Override
	public void DeactivateSim() {
		// TODO Auto-generated method stub
		active=false;
		System.out.println("AIRTEL Sim Card Deactivated");
		
	}

	

}