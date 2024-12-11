Que 3 : Modeling Employee and Address Details 
==============================================

Create Address Class:
---------------------
Implement a class with private fields for the street and city.
Provide a constructor to initialize these fields.
Implement getters and a toString() method to display the address.


Create Person Class:
--------------------
Implement a class with private fields for the name and an Address object.
Provide a constructor to initialize the name and address.
Implement a method to display the person's name and address.

Create Test class:
------------------
-> Create a main method :
-> Instantiate an Address object with sample data.
-> Instantiate a Person object with the address you created.
-> Print the employee's details using the method in the Person class.

Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading numeric values for any above Classe then make sure if any numeric value is <=0 then print "Error Invalid Input".
                
sample output : Error Invalid Input


TEST CASE 2:
------------
sample input  :
                Address address = new Address("123 Elm Street", "Springfield");
                Person person = new Person("John Doe", address);
                System.out.println(person);
       
sample output : Name: John Doe, Address: 123 Elm Street, Springfield


##########################################################################################