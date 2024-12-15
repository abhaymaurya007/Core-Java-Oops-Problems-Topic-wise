package Prob12.abhay.oops;

public class RoundedSum {
	public static int sumOfRoundedValues(int x) {
		
		int v=0,j=x%10;
		if(j<5) {
			v=x-x%10;
			}
			else if(j>=5)
				{v=x+(10-x%10);	}
		return v;
		}
	}
	


