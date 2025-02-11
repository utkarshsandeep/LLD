package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern.Observer;

import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern.Observable.Stock;

public class Email implements Notification {

    String email;
    Stock stock;

    public Email(String email, Stock stock) {
        this.email = email;
        this.stock = stock;
    }

    @Override
    public void update() {
        System.out.println(email + " Notification received for product stock");
    }
}
