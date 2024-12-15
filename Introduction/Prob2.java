/*Program 02:
-----------
Write a Java program to check if a given number is 
a palindrome. A number is a palindrome if it remains
 the same
 when its digits are reversed.*/
package introduction;

public class Prob2 {
	public static void main(String []args) {
		int a=121,n=0;
		int dup=a;
		for(;a!=0;a=a/10) {
			int p=a%10;
			n=n*10+p;
		}
		if(dup==n) {
			System.out.println("pailindrome");
		}
		else {
			System.out.println(" not a pailindrome");
		}
   }

}
