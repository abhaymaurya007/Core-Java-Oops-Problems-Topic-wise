package introduction;

public class Prob1 {
	public static void main(String []args) {
		System.out.println("----------------------------------");
		int a=60,b=25,c=4,d=3,e=a*c,f=b*d,dis=50,bill=e+f,tbill=bill-dis;
		/*a=chicken rate
		 b=veg puff rate
		 c=no. of items in chicken roll
		 d=no
		 */ 
		System.out.println("Item        rate  price ");
		System.out.println("chickeen     "+60+"    "+e);
		System.out.println("veg puff     "+60+"    "+f);
		System.out.println("discount     "+50);
		System.out.println("total bil  "+bill+"-"+dis+" ="+tbill+"Rupees");
		
	}

}
