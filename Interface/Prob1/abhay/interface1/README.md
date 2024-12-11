Q-1)
----
Create an interface AdvancedArithmetic

which contain method  :

Method name :divisorSum
return Type    :int
Argument type:int
Access Modifier :public
non-access modifier :abstract

 
Then write a class called MyCalculator which implements the interface AdvancedArithmetic. 

divisorSum function just takes an integer as input and return the sum of all its divisors.

For example divisors of 6 are 1,2,3 and 6, so divisorSum should return 12. 

Sample Input 
6 
Sample Output 
12 
Explanation 
Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12. 
A class Testing is given to you with a main method. Use this class to test your solution's classes and meth
ods.


Example :
-----------
Test Case 1 : 
--------------
Sample Input: 6

Expected Output:

Sum of divisors: 12
Explanation: Divisors of 6 are 1, 2, 3, and 6. 1 + 2 + 3 + 6 = 12.

Test Case 2 : 
--------------
Sample Input: -6

Expected Output:
Error: Input must be a positive integer.


Test Case 3:
--------------
Sample Input: 0

Expected Output:
Error: Input must be a positive integer.

Test Case 4:
--------------
Input: abc

Expected Output:

Error: Invalid input. Please enter a valid positive integer.

Test Case 5: 
--------------
Input: 28

Expected Output:
Sum of divisors: 56
Explanation: Divisors of 28 are 1, 2, 4, 7, 14, and 28. 1 + 2 + 4 + 7 + 14 + 28 = 56.