
/*
Question-1
--------------
Create an Employee class (BLC Class)

Attributes :

names		Return Type
--------		---------------		
 firstName   	:String   
 lastName      	:String  
 employeeId 	:int  
 salary  		:double  
 NoOfProject 	:int 

Access Modifier : private (for all varriables)  

Implement constructors to initialize these properties.

implement calculateSalary() method that will add extra ammount in salary based on NoOfProject.

Return Type       : void
Access modifier :public

NoOfProject is more than 5 and less that 10 then add 5000
NoOfProject is more than 10 and less that 20 then add 10000
NoOfProject is more than 20 then add 15000

Take another class Tester (ELC Class) which is having main method and instantiate the Employee object and execute the methods.


Test Case 1: 
----------------
Valid Input with Projects Between 6 and 10
Input:

firstName: John
lastName: Doe
employeeId: 101
salary: 50000.00
NoOfProject: 7

Expected Output:

After executing calculateSalary(), the salary should be updated to 55000.00.
Print output showing the updated salary: 55000.00.

Test Case 2:
---------------
 Invalid Number of Projects (Negative Value)
Sample Input:

firstName: Michael
lastName: Johnson
employeeId: 105
salary: 45000.00
NoOfProject: -5

Expected Output:

Print an error message indicating invalid number of projects (e.g., "Number of projects cannot be negative").
Salary remains 45000.00.




*/