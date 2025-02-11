package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern.Observable;

import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.ObserverDesignPattern.Observer.Notification;

public interface Stock {
    public void add(Notification notification);
    public void remove(Notification notification);
    public void notifySubscribers();
    public void setStockCount(int stockCount);
    public int getStockCount();
}
