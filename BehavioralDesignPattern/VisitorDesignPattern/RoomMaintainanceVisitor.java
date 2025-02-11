package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.VisitorDesignPattern;

public class RoomMaintainanceVisitor implements RoomVisitor {
    @Override
    public void visit(DeluxeRoom room) {
        System.out.println("Deluxe Room Maintainance");
    }

    @Override
    public void visit(DoubleRoom room) {
        System.out.println("Double Room Maintainance");
    }

    @Override
    public void visit(SingleRoom room) {
        System.out.println("Single Room Maintainance");
    }
}
