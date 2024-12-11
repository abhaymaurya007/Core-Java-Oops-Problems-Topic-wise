package Prob7abhay.Relation7;

public class Shape {
	public void Shaperandshape() {
		
	switch((int)(Math.random()*3)) {
	   case 0:{
		   Circle c1=new Circle();
		   c1.draw();
		   c1.erase();
		   break;}
	   case 1:
		   {Square s1=new Square();
		   s1.draw();
		   s1.erase();
		   break;}
	   case 2:
		   {Triangle t1=new Triangle();
		   t1.draw();
		   t1.erase();
		   break;
		   }
		   default :
			   System.out.println("give right number");
	}
	}
}