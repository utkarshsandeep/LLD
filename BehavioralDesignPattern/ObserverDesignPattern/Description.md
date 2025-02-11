There are two things here Observable and Observer, whenever state changes
of Observable, all the Observers are notified and they can take action accordingly.

In this example, we have a WeatherStation class that acts as an Observable.
It has a list of Observers (Display) that are interested in the weather updates.
Whenever the weather changes, the WeatherStation notifies all the Observers.

The WeatherStation class has three methods:
1. addObserver(Observer observer): Adds an Observer to the list of Observers.
2. removeObserver(Observer observer): Removes an Observer from the list of Observers.
3. notifyObservers(): Notifies all the Observers when the weather changes.