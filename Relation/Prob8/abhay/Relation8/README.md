---------------
Question-
---------------
 Design a  Java program that models a Hospital Management System using inheritance:

Create class HospitalStaff with following attributes

declare variable:

private String name;
private int age;
private String role;

create one parameterized Constructor and initialize values

method Name:- work()
Access modifier :-public
return type:-void

this method will print the role and there name with "is working massage"

*create second class Doctor which will inherited with HospitalStaff

declare variable:
private String specialization;

 take one parameterized Constructor and initialize values

// Overriding work() method for doctors
it will print Roll and Name with this massage" with specialization in " + specialization + " is treating patient
s."

* Create Nurse class which will inherite HospitalStaff

Variables :-
private int yearsOfExperience;

take  one parameterized Constructor and initialize values

// Overriding work() method for nurses
it will print massage in this format
Role + " " + NAME + " with " + yearsOfExperience + " years of experience is taking care of patients."

create class HospitalManagementSystem inside this take main method where use this class for testing
create object for every class and check

Question - 3
--------------
Superclass Payment:

Method to process a payment:

Method Name: processPayment
Access Modifier: public
Return Type: void

Task: Print a generic payment processing message (e.g., "Processing payment").


Subclass CreditCardPayment:

Override processPayment method to print a credit card-specific message:

Method Name: processPayment
Access Modifier: public
Return Type: void

Task: Print a message for credit card payment (e.g., "Processing credit card payment").

Subclass PayPalPayment:

Override processPayment method to print a PayPal-specific message:

Method Name: processPayment
Access Modifier: public
Return Type: void
 
Task: Print a message for PayPal payment (e.g., "Processing PayPal payment").


Subclass BankTransferPayment:

Override processPayment method to print a bank transfer-specific message:

Method Name: processPayment
Access Modifier: public
Return Type: void

Task: Print a message for bank transfer payment (e.g., "Processing bank transfer payment").


Create a Main Class in which take main method and take one static method

Method :

Method to process multiple payments in a single transaction:

Method Name: processMultiplePayments
Access Modifier: public
Return Type: void
Arguments: Payment... payments

Task: Loop through each payment and call the processPayment method.

Create instances of Payment, CreditCardPayment, PayPalPayment, and BankTransferPayment.
Use polymorphism to call the processPayment method on each instance.



Test Case 1: 
--------------
Generic Payment
Sample Input:
if you are calling processPayment() of generic Payment

Expected Output :
Processing payment


Test Case 2: Credit Card Payment
---------------
Sample Input:
if you are calling processPayment() of Credit Card Payment

Expected Output :
Credit Card  payment done.