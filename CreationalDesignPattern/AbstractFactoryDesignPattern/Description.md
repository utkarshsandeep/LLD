It is a factory of factory and behaves like a factory, which is used to create factories.
This design pattern is used to create an instance of several families of classes.
It provides an interface for creating families of related or dependent objects without
specifying their concrete classes.

Abstract Factory Design Pattern has the following participants:
1. AbstractFactory: Interface for creating the abstract product objects.
2. ConcreteFactory: Implements the AbstractFactory interface to create the concrete product objects.
3. AbstractProduct: Interface for the product objects.
4. ConcreteProduct: Implements the AbstractProduct interface to define a product object.
5. Client: Uses the AbstractFactory and AbstractProduct interfaces to create a family of related objects.

Abstract Factory Design Pattern is used when you want to create a family of related or dependent objects.
Abstract Factory Design Pattern examples like : GUI Factory, Database Factory, etc.