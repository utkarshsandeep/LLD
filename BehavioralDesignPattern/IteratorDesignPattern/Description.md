Iterator Design Pattern is a behavioral design pattern that provides a way
to access the elements of a collection sequentially without exposing its
underlying representation.

It has the following participants:
1. Iterator: Interface for accessing and traversing elements.
2. ConcreteIterator: Implements the Iterator interface and keeps track of the current position
in the traversal of the aggregate.
3. Aggregate: Interface for creating an Iterator object.
4. ConcreteAggregate: Implements the Aggregate interface and returns an instance of the
ConcreteIterator.
5. Client: Uses the Iterator to traverse the elements of the aggregate.

Iterator Design Pattern is used when you want to access the elements of a collection without
exposing its underlying representation.
