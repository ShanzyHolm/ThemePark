Homework.
Practice what you have learned about using classes, abstract, classes and interfaces to model and test a simple system which interests or seems relevant to you.

To Do.

Pick a system/scenario (examples below) which you can visualise easily, then attempt to model that system in Java. This can be anything you want, but if you are struggling for ideas, here are some suggestions;



Examples.


Kaiju Attack.
Model a Kaiju (Large Japanese Monster) Attack On A City.

Using a 'Kaiju' abstract class, create two giant lizards to run amok in Tokyo. Parameters for each Kaiju should include; 'name', 'healthValue' and 'attackValue'. Give the Kaiju a 'roar' method which returns a string.
Using a 'Vehicle' abstract class, create two Army vehicles to battle the Kaiju. Parameters should include; 'type' and 'healthValue'.
Give the Kaiju an 'attack' method which can be used to damage vehicles.
Give the Kaiju a 'move'/'fly' method, which returns a string (depending on the Kaiju).
Give the army vehicles two methods of damaging the Kaiju. (Give the vehicles attack methods).
Expand the model to include buildings, more Kaiju and anything else you can think of.
Optional
Create a runner file in which instances of Kaiju can attack and damage instances of army vehicles. Extensions;




Theme Park.
Model a theme park and it's customers.

Using a 'Ride' abstract class, create 2 or 3 rollercoaster type rides. Parameters could include price, min age/height etc.
Using a customer class create instances of people to use the rides. Give them an age, height and money.
Allow the customers to interact with the rides (I.E. check they are tall/old enough) have them pay their money.


Extensions;
Expand the model in whichever direction you like. Add different types of ride, create a queuing system.




DISCARDED BRIEF FOR FURTHER IDEAS:


Theme Park - Homework Revising Abstract Classes, Interfaces and Polymorphism.
Learning Objectives
Practice modelling a large real world domain and what you have learned about using:

classes
inheritance
abstract classes
interfaces
ThemePark
MVP - Classes and Abstract Classes
Model a ThemePark (with various Attraction and Stalls) and its Visitors.

Remember to model class diagrams first, then write tests, then write code.

Visitor has age, height, money
Using a Attraction abstract class (which has a name), create some subclasses for Rollercoaster, Dodgems, Park, Playground
Using a Stall abstract class (which has a name, ownerName and parkingSpot), create some classes for IceCreamStall, CandyFlossStall, TobaccoStall
Extension - Classes and Abstract Classes
ThemePark stores all Attractions and Stalls in it.
ThemePark has a method visit(Visitor, Attraction)
MVP - Interfaces
Introduce some Interfaces to enable charging, restricting and reviewing attractions and stalls:

ITicketed promises double defaultPrice() and double priceFor(Visitor)

ISecurity promises boolean isAllowedTo(Visitor)

IReviewed promises int getRating() and String getName()

Have some of the classes implement these interfaces. Below are the rules about what the implementations should be:

Playground implements ISecurity because it has a maximum age of 15

TobaccoStall implements ISecurity because it has a minimum age of 18

Rollercoster implements ISecurity and requires a visitor to be over 145cm tall and over 12 years of age

Extension - Interfaces
Note: Starting prices are: £8.40 Rollercoaster, £4.50 Dodgems, £2.80 IceCreamStall, £4.20 CandyFlossStall, £6.60 TobaccoStall

Rollercoaster implement ITicketed and charges tall people over 200cm double fee
Dodgems implement ITicketed and charge half price to children under 12 years old
All Stalls implement ITicketed but they use a starting price whoever is buying
Park and Playground have no ticketing gate so do not implement ITicketed for these, but all other Attractions do.
MVP - Polymorphism
All Attractions and Stalls have a class variable int rating
All Attractions and Stalls implement IReviewed and implement a getter for int getRating() and String getName()
ThemePark has a method getAllReviewed() which returns an ArrayList of IReviewed
Extension - Polymorphism
ThemePark has a method getAllAllowedFor(Visitor) which takes a Visitor and returns an ArrayList of ITicketed
ThemePark has a method that can return a string with all reviews, returning a String a little bit like this: Rollercoster: 4, Dodgems: 8, Park: 2, IceCream: 6, TobaccoStall: 1