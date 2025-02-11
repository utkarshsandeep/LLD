package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.VisitorDesignPattern;

public interface RoomVisitor {

    public void visit(SingleRoom singleRoom);
    public void visit(DoubleRoom doubleRoom);
    public void visit(DeluxeRoom deluxeRoom);
}
