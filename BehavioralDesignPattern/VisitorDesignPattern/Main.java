package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.VisitorDesignPattern;

public class Main {
    public static void main(String[] args) {
        RoomElement singleRoom = new SingleRoom();
        RoomElement doubleRoom = new DoubleRoom();
        RoomElement deluxeRoom = new DeluxeRoom();

        RoomVisitor pricingVisitor = new RoomPricingVisitor();
        singleRoom.accept(pricingVisitor);
        System.out.println(((SingleRoom)singleRoom).price);


        RoomVisitor reserveVisitor = new RoomReserveVisitor();
        doubleRoom.accept(reserveVisitor);

        RoomVisitor maintenanceVisitor = new RoomMaintainanceVisitor();
        deluxeRoom.accept(maintenanceVisitor);
    }
}
