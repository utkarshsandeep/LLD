package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern;

import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern.Observable.Stock;
import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern.Observable.Iphone;
import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern.Observer.Email;
import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern.Observer.Mobile;
import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern.Observer.Notification;

public class Store {
    public static void main(String[] args) {
        Stock iphone = new Iphone();

        Notification observer1 = new Email("abc@gmail.com", iphone);
        Notification observer2 = new Email("pqr@gmail.com", iphone);
        Notification observer3 = new Mobile("user", iphone);

        iphone.add(observer1);
        iphone.add(observer2);
        iphone.add(observer3);

        iphone.setStockCount(10);
        iphone.setStockCount(0);
        iphone.setStockCount(100);

    }
}
