package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.NullObjectDesignPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new VehicleFactory().getVehicle("Car");
        System.out.println(vehicle.getFuelCapacity());
        System.out.println(vehicle.getSeatCapacity());

        Vehicle vehicle1 = new VehicleFactory().getVehicle("Bike");
        System.out.println(vehicle1.getFuelCapacity());
        System.out.println(vehicle1.getSeatCapacity());

        Vehicle vehicle2 = new VehicleFactory().getVehicle("Truck");
        System.out.println(vehicle2.getFuelCapacity());
        System.out.println(vehicle2.getSeatCapacity());
    }
}
