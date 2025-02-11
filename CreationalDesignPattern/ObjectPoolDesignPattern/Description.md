Object Pool Design Pattern is a creational design pattern that provides a way to reuse objects
that are expensive to create.
It has three main participants:
1. ObjectPool: The class that manages the pool of objects.
2. Reusable: The interface that defines the methods that the objects in the pool should implement.
3. ReusableImpl: The class that implements the Reusable interface.
Object Pool Design Pattern is used when you want to reuse objects that are expensive to create.

Eg: Database connection pool, Thread pool, etc.

The object pool design pattern uses singleton design pattern to manage the pool of objects.
It requires thread safety to manage the pool of objects in a multi-threaded environment while
acquiring and releasing the objects from the pool.