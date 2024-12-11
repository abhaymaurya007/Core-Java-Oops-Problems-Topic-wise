package Prob11.abhay.inheritence11;

public class inheritencemain {
	public static void main(String []args) {
      Electronics ele=new Electronics("Washing Machine", 15000, "LG");
      ele.displayInfo();
      ele.Calculate(2);
      clothing cl=new clothing("shirt", 400, "zudio");
      cl.displayInfo();
      cl.Calculate(4);
      OnlineShopping os=new OnlineShopping("sbzii", 500);
      os.displayInfo();
      os.Calculate(3);
      }
        
}
