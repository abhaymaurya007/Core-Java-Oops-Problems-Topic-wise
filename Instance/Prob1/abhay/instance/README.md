Ques - 
------------
Scenario: Zoo Simulation with Animal Behaviors 


Base Class - Animal:
----------------------

Create a class named Animal with the following attributes:

species (String): Represents the species of the animal.
Implement a parameterized constructor to initialize the species attribute.
Include getter method for species.

Implement methods:
makeSound(): Prints a generic animal sound.
toString(): Returns a string representation of the animal.
reproduce(): It prints the message "Generic reproduction method for all animals." and returns a new Animal object with the species set to "Unknown." 

Subclass - Mammal:
---------------------

Create a subclass named Mammal that extends the Animal class.
Add an additional attribute:
hasFur (boolean): Indicates whether the mammal has fur.
Implement a parameterized constructor to initialize the attributes of both the Animal class and the Mammal class.

Override the makeSound() and toString() methods in the Mammal class.
@Override reproduce(): 
In the Mammal subclass, the reproduce() prints the message "Mammals give birth to live young." and returns a new Mammal object with the same species and fur attribute as the parent mammal.  

Implement an additional method:
nurseYoung(): Prints a message about mammals nursing their young.

Subclass - Bird:
---------------------
Create a subclass named Bird that extends the Animal class.
Add an additional attribute:
canFly (boolean): Indicates whether the bird can fly.
Implement a parameterized constructor to initialize the attributes of both the Animal class and the Bird class.

Override the makeSound() and toString() methods in the Bird class.
Override the reproduce()
Similarly, in the Bird subclass, prints the message "Birds lay eggs as a means of reproduction." and returns a new Bird object with the same species and flying ability as the parent bird.

buildNest(): Prints a message about birds building nests for their eggs.

ELC  - ZooSimulation:

Create an ELC named ZooSimulation that:

Instantiates a Mammal object (e.g., lion) with sample data.
Invokes methods on the Mammal object to demonstrate mammal-specific behaviors.
Instantiates a Bird object (e.g., eagle) with sample data.
Invokes methods on the Bird object to demonstrate bird-specific behaviors.