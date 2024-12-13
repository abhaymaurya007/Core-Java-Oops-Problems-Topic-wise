package Prob6.abhay.interface6;

public class SimpleCalculator implements Calculator{

	@Override
	public void calculateSum(double... d) {
		// TODO Auto-generated method stub
		double sum=0;
		for(double s:d) {
			sum=sum+s;
		}
		System.out.println("Sum is :"+sum);
		
	}
      
}
