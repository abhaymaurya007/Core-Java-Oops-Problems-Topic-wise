/*Program 04:
-----------
Write a program to input the basic salary of a person. He gets 15% of the basic as HRA, 15% of the basic as Conveyance allowance and 10% of the basic as Entertainment allowance. The total salary is calculated by adding Basic + HRA + Conveyance + Entertainment Allowance. Calculate and print the total salary of person.
Take the Basic Salary from Command Line Argument
*/
package introduction;

public class Prob4 {
    public static void main(String []args) {
    double sal = Double.parseDouble(args[0]);
    
    	double hra=sal*0.15,ca=sal*0.15,ea=sal*0.1;
    	double totsal=sal+hra+ca+ea;
    	System.out.println("total sal-"+totsal);
    	
    }
}
