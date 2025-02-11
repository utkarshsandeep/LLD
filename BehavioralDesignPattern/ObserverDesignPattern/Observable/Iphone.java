package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern.Observable;

import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern.Observer.Notification;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements Stock {

    public List<Notification> notificationList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(Notification notification) {
        notificationList.add(notification);
    }

    @Override
    public void remove(Notification notification) {
        notificationList.remove(notification);
    }

    @Override
    public void notifySubscribers() {
        for (Notification notification : notificationList) {
            notification.update();
        }
    }

    @Override
    public void setStockCount(int stockCount) {
        if(this.stockCount == 0) {
            notifySubscribers();
        }
        this.stockCount = stockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
