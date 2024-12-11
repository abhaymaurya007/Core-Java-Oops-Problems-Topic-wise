
##########################################################################################


Que 4 : Change The Driver
==========================

Scenario Description :
John is a car enthusiast who loves collecting detailed information about different cars and their drivers. 
He has recently acquired information about a Hyundai Creta, and he has also collected details about the car's driver, John. 
John wants to store this information in his database and ensure that any changes to the original car details do not affect his backup copy. 
He also plans to change the driver of the car at a later time.

John has a Java program with two main classes: Car and Driver. He wants to ensure that:

He can create a Car object with specific attributes and set its driver's details.
He can create a copy of this Car object, ensuring the copy remains unchanged even if the original is modified.
He can change the driver of the original Car object.
He can print the details of both the original and the copied Car objects to confirm the deep copy functionality.
Help John by creating a Java program to accomplish these tasks.

Create a Java BLC class named Car with following attributes:
 private String brand
 private String model
 private int year and
 private Driver driver

Implement a parameterised constructor to initialise all the instance variable of Car.
Implement one copy constructor for the Car class that takes a Car object and  initialize the new Car object with the same attributes.
Take a pair of setter and getter method for all the instance variables.
In the Car class, create a method named changeDriver(Driver newDriver) that changes the driver of the car to the specified driver.

Create a Driver class and the class should have following attributes:
 private String name and
 private int age 
Implement a parameterised constructor to initialise all the instance variable of Driver.
Take a pair of setter and getter method for all the instance variables.

Create a Main class that creates a Car object and sets its attributes and the attributes of its driver. Then, create a copy of the Car object using the copy constructor and print the attributes of both the original and the copy of the Car objects to confirm that the copy constructor works correctly.
Finally, use the changeDriver() method to change the driver of the original Car object, and print the attributes of both the original and the copy of the Car objects again to confirm that the copy constructor created a deep copy of the Driver object and that the changeDriver method did not affect the driver of the copy of the Car object.


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
               Driver driver1 = new Driver("John", 30);
               Car car1 = new Car("Hyundai", "Creta", 2020, driver1);
               Driver driver2 = new Driver("Logan", 35);

sample output : 
              Original Car Details:
              Car Brand: Hyundai
              Car Model: Creta
              Car Year: 2020
              Driver Name: John
              Driver Age: 30
              
              Copied Car Details:
              Car Brand: Hyundai
              Car Model: Creta
              Car Year: 2020
              Driver Name: John
              Driver Age: 30

              Original Car Details after Changing Driver:
              Car Brand: Hyundai
              Car Model: Creta
              Car Year: 2020
              Driver Name: Logan
              Driver Age: 35

              Copied Car Details after Changing Driver in Original Car:
              Car Brand: Hyundai
              Car Model: Creta
              Car Year: 2020
              Driver Name: John
              Driver Age: 30

##########################################################################################