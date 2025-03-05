# Introduction
A Class is like an object constructor, or a "blueprint" for creating objects.

### Components of Java Classes
Modifiers: A class can be public or has default access (Refer this for details).
Class keyword: Class keyword is used to create a class.
Class name: The name should begin with an initial letter (capitalized by convention).
Superclass (if any): The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
Interfaces(if any): A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
Body: The class body is surrounded by braces, { }.
Constructors are used for initializing new objects

## differences between classes and objects:
Class is the blueprint of an object. It is used to create objec nots.	An object is an instance of the class.
No memory is allocated when a class is declared.	Memory is allocated as soon as an object is created.
A class is a group of similar objects.	An object is a real-world entity such as a book, car, etc.
Class is a logical entity.	An object is a physical entity.
A class can only be declared once.	Objects can be created many times as per requirement.
An example of class can be a car.	Objects of the class car can be BMW, Mercedes, Ferrari, etc.

### Types of classes
Concrete classes
Abstract classes
Private classes
etc

# Concrete classes
These are the normally defined classes

# Interfaces
This is like a template of a class
Defines what a class has or does
Classes can implement more than one interface
variables Doesnt need a bod

# Abstract classes
Adds security to the program
Prevent abstact classes from being used, forces the user to define a class in more detail

Defined by the abstract keyword
Can define a class or method
Abstract methods dont need a body
for secure error free programs;
Cant inherit an abstract class, must use the subclass of the abstract class


