package Prob11.abhay.oops;

public class TwoDigitsDifference {
	public static int getDiffofDegits(int x) {
		int c=x%10,d=x/10,l=0;
		if(c>d) {
			l=c-d;
		}
		else
		{	l=d-c;}
		return l;
	}

}
