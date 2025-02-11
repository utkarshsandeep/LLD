package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern.Observer;

import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern.Observable.Stock;

public class Mobile implements Notification {

    String name;
    Stock stock;

    public Mobile(String name, Stock stock) {
        this.name = name;
        this.stock = stock;
    }

    @Override
    public void update() {
        System.out.println(name + " Notification received for product stock");
    }
}
