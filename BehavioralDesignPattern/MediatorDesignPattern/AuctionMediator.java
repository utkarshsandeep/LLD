package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.MediatorDesignPattern;

public interface AuctionMediator {
    public void addBidder(Colleague bidder);
    public void placeBid(Colleague bidder, int amount);
}
