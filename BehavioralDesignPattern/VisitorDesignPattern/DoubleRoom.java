package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.VisitorDesignPattern;

public class DoubleRoom implements RoomElement{

    public int price = 0;

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
