package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.VisitorDesignPattern;

public class RoomReserveVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Reserving Single Room");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Reserving Double Room");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Reserving Deluxe Room");
    }
}
