Memento Design Pattern is a behavioral design pattern that lets you save and restore
the previous state of an object without revealing the details of its implementation.

It has three main participants:
1. Originator: The object for which the state is to be saved.
2. Memento: The object that holds the state of the Originator.
3. Caretaker: The object that keeps track of the saved states of the Originator.

Memento Design Pattern is used when you want to save the state of an object so that you can restore it later.
It is useful when you need to implement undo/redo functionality in your application.

Examples of Memento Design Pattern:
1. Text Editors: Text editors use the Memento Design Pattern to implement undo/redo functionality.
2. Database Transactions: Database transactions use the Memento Design Pattern to save the state of the database before making changes.
3. Video Games: Video games use the Memento Design Pattern to save the state of the game so that players can resume from where they left off.