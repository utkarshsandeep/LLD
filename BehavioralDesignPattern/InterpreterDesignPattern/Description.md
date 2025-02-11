Interpreter Design Pattern is a behavioral design pattern that defines a grammar
for interpreting a language and provides a way to evaluate sentences in that language.

It has three main participants:
1. AbstractExpression: The interface that defines the interpret method.
2. TerminalExpression: The class that implements the interpret method for terminal expressions.
3. NonTerminalExpression: The class that implements the interpret method for non-terminal expressions.

Interpreter Design Pattern is used when you want to interpret a language or grammar.