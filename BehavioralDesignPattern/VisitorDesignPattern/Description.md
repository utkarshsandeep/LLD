Visitor Design Pattern is a behavioral design pattern that allows you to separate the
algorithm from the object structure on which it operates.
It has four main participants:
1. Visitor: The interface that defines the visit method for each concrete element in the object
structure.
2. ConcreteVisitor: The class that implements the Visitor interface to define the visit method
for each concrete element.
3. Element: The interface that defines the accept method for each concrete visitor.
4. ConcreteElement: The class that implements the Element interface to define the accept method
for each concrete visitor.

Visitor Design Pattern is used when you want to separate the algorithm from the object structure.
It is used when you have a complex object structure and you want to perform different operations
on the elements of the object structure without changing the classes of the elements.

It uses double dispatch to call the appropriate method on the visitor based on the type of the element.
It allows you to add new operations to the object structure without modifying the classes of the elements.

Single Dispatch : The process of selecting the appropriate method to call based on the type of the object.
Double Dispatch : The process of selecting the appropriate method to call based on the types of two objects.