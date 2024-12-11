Q-2)
-----
Employee Management System:

Employee Interface :

Create an interface named Employee with two methods: 

Method Name   :calculateSalary() 
Return Type      :double
Acess Modifier  :public 

Method Name  : generatePayroll()
Return Type     :void
Acess Modifier :public 

The calculateSalary() method should compute the salary for the employee.
The generatePayroll() method should generate the payroll information for the employee.

FullTimeEmployee Class :

Implement a class named FullTimeEmployee that implements the Employee interface.

Include Attributes :
employeeId     	:(int)
employeeName   	:(String)
monthlySalary 	:(double) 
benefits 			:(double)

Acess modifier :private(for all the varriable )

Provide a constructor that initializes the employee details.

Implement the calculateSalary() method to calculate the salary for a full-time employee, including benefits.

Implement the generatePayroll() method to print the payroll information for a full-time employee.

Testing :

Take a main clas  Employee Management System.
Create instances of  FullTimeEmployee.
Call the calculateSalary() and generatePayroll() methods to ensure correct calculations and information generation.

Test Case 1 : 
--------------
for Negative Salary
Sample Input:
if user eneterd negative salary

Expected Output :
Error: Monthly salary cannot be negative.


Test Case 2 :
--------------
 Empty Employee Name
Input:

if employee is passed by the user is ""(empty)

Expected Output:

Error: Employee name cannot be empty.

Test Case 3 :
--------------
Sample Input :
if all the information is valid input

Expected Output :
Print all the detail information.