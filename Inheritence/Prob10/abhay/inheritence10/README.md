You are tasked with modeling a simple banking system using Java classes. Implement three classes: BankAccount, SavingsAccount, and CheckingAccount.

BankAccount Class:

Attributes:

int accountNumber: Represents the account number.
double balance: Represents the current balance in the account.

create Parametrized constructor to initialize Instance Variables

Methods:-

1)method name:- deposite
Return Type:- void
parameter: double amount
this method Adds the specified amount to the balance.

2)method name:- withdraw
Return Type:- void
parameter: double amount

Subtracts the specified amount from the balance if sufficient funds are available; otherwise, prints "Insufficient funds."

SavingAccount class:-

extends from BankAccount.

Additional Attributes:
double interestRate: Represents the interest rate for the savings account.

create Parametrized constructor to initialize Instance Variables


Methods:-

1)method name:- addInterest
Return Type:- void
parameter: NO
this method Adds interest to the balance based on the interest rate.

CheckingAccount Class:

extends from BankAccount.

Additional Attributes:

double overdraftLimit: Represents the overdraft limit for the checking account.//3000

create Parametrized constructor to initialize Instance Variables

Methods:-

void withdraw(double amount): Subtracts the specified amount from the balance if it does not exceed the overdraft limit(3000); otherwise, prints "Exceeds overdraft limit."


create main class to test your logic


=====================================================
