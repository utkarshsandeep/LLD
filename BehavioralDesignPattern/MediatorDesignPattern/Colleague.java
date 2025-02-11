package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.MediatorDesignPattern;

public interface Colleague {
    void placeBid(int amount);
    void receiveBidNotification(int amount);
    String getName();
}
