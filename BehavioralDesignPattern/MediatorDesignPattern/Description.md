Mediator Design Pattern is a behavioral design pattern that reduces coupling
between components of a program by making them communicate indirectly,
through a special mediator object.

Mediator Design Pattern is used to handle communication between related objects.

Mediator Design Pattern is used to define an object that encapsulates how objects interact.

Examples like : Chat Application, Air Traffic Control System, Stock Exchange, E-Auction, etc.

It has the following participants:
1. Mediator: Interface for communicating with Colleague objects.
2. ConcreteMediator: Implements the Mediator interface and coordinates communication between Colleague objects.
3. Colleague: Interface for communicating with other Colleague objects.
4. ConcreteColleague: Implements the Colleague interface and communicates with other Colleague objects through the Mediator.

