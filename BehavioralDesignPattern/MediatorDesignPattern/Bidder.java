package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.MediatorDesignPattern;

public class Bidder implements Colleague{
    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int amount) {
        auctionMediator.placeBid(this, amount);
    }

    @Override
    public void receiveBidNotification(int amount) {
        System.out.println("Bidder: " + name + " received bid notification: " + amount);
    }

    @Override
    public String getName() {
        return name;
    }
}
