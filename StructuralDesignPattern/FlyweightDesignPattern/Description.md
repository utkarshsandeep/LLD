Flyweight Design Pattern is a structural design pattern that is used when we need to
create a large number of similar objects (having similar characteristics) from one object.
It is used to reduce memory usage or computational expenses by sharing as much as possible
with related objects. It is a way to use objects in large numbers when a simple repeated
representation would use an unacceptable amount of memory.

Here we have two types of properties of objects: intrinsic and extrinsic.
Intrinsic properties are those properties that are shared among all objects.
Extrinsic properties are those properties that are different for each object.

The Flyweight pattern is divided into two parts:
1. Flyweight Factory: It is used to create and manage the flyweight objects.
2. Flyweight: It is an interface that is implemented by the flyweight objects.

Flyweight pattern uses immutable objects, which means that once an object is created,
it cannot be modified. If you want to modify an object, you need to create a new object.