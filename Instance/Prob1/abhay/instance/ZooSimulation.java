package Prob1.abhay.instance;

public class ZooSimulation {
	public static void main(String[] args) {
		Animal a1=new Mammal("mammal", true);
	  if(a1 instanceof Mammal) {
		  
		  a1.makeSound();
		  a1.reproduce();
		  
	  }
	  else if(a1 instanceof Bird) {
		  a1.makeSound();
		  a1.reproduce();
		  ((Bird) a1).buildNest();
	  }
		
	}

	//Mammal m1=new Mammal("mammal", true);
//			m1.makeSound();
//		m1.reproduce();
//		  System.out.println(m1);
//		  Bird b1=new Bird("bird",true);
//		  b1.makeSound();
//		  b1.reproduce();
//		  b1.buildNest();
//		  System.out.println(b1);

}
