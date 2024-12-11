package Prob4abhay.Relation4;

public class main4has {
      public static void main(String[] args) {
    	  Driver driver1 = new Driver("John", 30);
          Car car1 = new Car("Hyundai", "Creta", 2020, driver1);
          
          Car car2=new Car(car1);
          System.out.println(car1);
          System.out.println(car2);
          Driver driver2 = new Driver("Logan", 35);
          car1.changeDriver(driver2);
          System.out.println(car1);
          System.out.println(car2);
          

	}
}
