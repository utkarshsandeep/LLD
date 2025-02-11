Command Design Pattern is a behavioral design pattern that encapsulates a request
as an object, thereby allowing for parameterization of clients with different requests,
queuing of requests, and logging of requests.
It also supports undoable operations.

It has the following participants:
1. Command: Interface for executing an operation.
2. ConcreteCommand: Implements the Command interface and contains the receiver object.
3. Receiver: Knows how to perform the operation.
4. Invoker: Asks the command to carry out the request.
5. Client: Creates a ConcreteCommand object and sets its receiver.