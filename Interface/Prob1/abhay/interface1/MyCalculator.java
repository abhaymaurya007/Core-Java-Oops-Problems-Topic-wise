package Prob1.abhay.interface1;

public class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int x) {
		int sum=0;
		if(x>0 ) {
		for(int i=1;i<=x;i++) {
			if(x%i==0) {
				sum=sum+i;
				}}}
		else
		{
			System.out.println("Give positive number");}
		return sum;
		
	}

}
