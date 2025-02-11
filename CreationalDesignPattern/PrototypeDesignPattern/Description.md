Prototype Design Pattern is a creational design pattern that allows you to create a
copy of an existing object without making your code dependent on its class.
It is used when you want to create a copy of an object without exposing its creation logic.
It is used when you want to avoid subclasses of an object creator in the client code.
It is used when you want to create a copy of an object without knowing its concrete type.
It is used when you want to create a copy of an object without coupling to its concrete class.
It is used when you want to create a copy of an object without using its copy constructor.

Prototype Design Pattern has the following participants:
1. Prototype: The interface that defines the clone method to create a copy of the object.
2. ConcretePrototype: The class that implements the Prototype interface to create a copy of the object.
3. Client: The class that uses the Prototype interface to create a copy of the object.
