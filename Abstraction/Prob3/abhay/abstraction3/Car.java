package Prob3.abhay.abstraction3;

public abstract class Car {
     private   String brand;
        private String model;
       private  int top_speed;
      private  int mileage ;
        int yearOfManufacturing ;
	
        public Car(String brand, String model, int top_speed, int mileage, int yearOfManufacturing) {
			super();
			this.brand = brand;
			this.model = model;
			this.top_speed = top_speed;
			this.mileage = mileage;
			this.yearOfManufacturing = yearOfManufacturing;
		}
		public String carBrand() {
        	return brand;
        }
		public String carModel() {
        	return model;
        }
        public int carMileage()
        {
        	return mileage;
        }
        public int carTopSpeed() {
        	return top_speed;
        }
        public int carYear() {
        	return yearOfManufacturing;
        }
        public abstract void display();
}
