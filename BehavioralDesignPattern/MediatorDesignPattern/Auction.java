package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.MediatorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{

    List<Colleague> bidders = new ArrayList<>();

    @Override
    public void addBidder(Colleague bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int amount) {
        for (Colleague colleague : bidders) {
            if(!colleague.getName().equals(bidder.getName())) {
                colleague.receiveBidNotification(amount);
            }
        }
    }
}
