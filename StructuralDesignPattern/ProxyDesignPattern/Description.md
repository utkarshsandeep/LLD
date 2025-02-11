Proxy Design Pattern is a structural design pattern that provides a surrogate or placeholder
for another object to control access to it.

It has four main participants:
1. Subject: The interface that defines the common methods for the RealSubject and Proxy classes.
2. RealSubject: The class that implements the Subject interface.
3. Proxy: The class that implements the Subject interface and controls access to the RealSubject class.
4. Client: The class that uses the Proxy interface to interact with the RealSubject class.

Proxy Design Pattern is used when you want to control access to an object.
It is used when you want to add additional functionality to an object without changing its source code.