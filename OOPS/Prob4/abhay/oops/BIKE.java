package Prob4.abhay.oops;

public class BIKE {
	int speed;
	String name;
	double milege;
	
	public void setProductData(int sp,String nam,double mil) {
		
		speed=sp;
		name=nam;
		milege=mil;
	}
	public void getProductInfo()
	{
		System.out.println("Bike name is : "+name);
		System.out.println("Bike speed is : "+speed+"km/hr");
		System.out.println("Bike miledge  is : "+milege+"km/lit");
	}

}
