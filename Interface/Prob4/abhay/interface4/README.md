-----------------------------------------------------------------------
Q4)
-------------
Question: Banking System with Loosely Coupled Architecture
___________________________________________________________

In this exercise, we'll develop a banking system to demonstrate the concept of loosely coupled architecture using interfaces and classes. The system will feature three banksóSBI, HDFC, and ICICIóeach with their respective implementation details, while customers can interact with these banks through a unified interface.

Components:
-------------

Bank Interface: An interface that outlines the essential methods for banking operations such as depositing, withdrawing, and checking account balance.

Bank Implementations: Three classesóSBI, HDFC, and ICICIóthat implement the Bank interface. Each class will define the specific logic for handling transactions and account management.

Customer Class: A Customer class with attributes like name and accountBalance. This class will interact with the banks using the methods provided by the Bank interface.

Tasks:

Define the Bank interface with methods:
-----------------------------------------

deposit(amount: double): void
withdraw(amount: double): void
checkBalance(): double
Implement the bank classes:

SBI, HDFC, and ICICI implementing the Bank interface. Each class should maintain an accountBalance attribute and provide appropriate implementations for the methods.

Create the Customer class:
------------------------------

Attributes: name (String), accountBalance (double)
Methods: deposit(Bank bank, double amount), withdraw(Bank bank, double amount), checkBalance(Bank bank)
Demonstrate the loosely coupled architecture:

Create instances of SBI, HDFC, and ICICI bank classes.
Create a Customer instance.
Allow the customer to interact with each bank:


Note: Feel free to provide constructors and any additional methods required for the classes. You can adapt the question based on your preferences and the level of understanding you want to assess.