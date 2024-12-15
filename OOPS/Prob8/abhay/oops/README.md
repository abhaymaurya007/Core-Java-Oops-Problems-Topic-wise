
Que 8 : Zoo Management System
=============================

You are tasked with creating a Zoo Management System that can handle different types of animals. 
You need to implement classes that represent animals and their specific characteristics.
In this system, you'll implement the concept of inheritance and method overriding to showcase the behavior of animals.

Follow the provided code as a base, and create the necessary classes to satisfy the requirements below:

Create a class named Animal:
-----------------------------
It should have private instance variables name (String) and age (int).
Implement a constructor that initializes the name and age.
Define a method makeSound() that prints "The animal makes a generic sound."
Define a method displayInfo() that prints the name and age.

Create a subclass named Lion:
-----------------------------
Extend the Animal class.
Add a private instance variable maneLength (int).
Implement a constructor that takes name, age, and maneLength as parameters and initializes the superclass constructor.
Define a method makeSound() method to print "The lion roars loudly."
Define a method displayManeLength() that prints the maneLength.

Create another subclass named Elephant:
---------------------------------------
Extend the Animal class.
Add a private instance variable tuskLength (float).
Implement a constructor that takes name, age, and tuskLength as parameters and initializes the superclass constructor.
Define a method  the makeSound() method to print "The elephant trumpets."
Define a method displayTuskLength() that prints the tuskLength.

Create a class named ZooManagement (as provided in the code):
-------------------------------------------------------------
In the main method, create instances of both Lion and Elephant with appropriate values.
Print information about the lion and the elephant, including their specific attributes and the sounds they make.

Your task is to implement the required classes based on the provided problem description. 


Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading numeric values for any above Classe then make sure if any numeric value is <=0 then print "Error Invalid Input".
                
sample output : Error Invalid Input



TEST CASE 2 :
-------------
sample input :
               Lion:
               Name: "Simba"
               Age: 5
               Mane Length: 20 cm

               Elephant:
               Name: "Jumbo"
               Age: 10
               Tusk Length: 2.5 meters

sample output : 
               Lion Details:
               Name: Simba, Age: 5
               The lion roars loudly.
               Mane Length: 20 cm
               
               Elephant Details:
               Name: Jumbo, Age: 10
               The elephant trumpets.
               Tusk Length: 2.5 meters


#######################################################################
