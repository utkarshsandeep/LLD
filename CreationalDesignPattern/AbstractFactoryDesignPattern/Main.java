package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.AbstractFactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getVehicle("Luxury", "BMW");
        vehicle.drive();

        VehicleFactory vehicleFactory1 = new VehicleFactory();
        Vehicle vehicle1 = vehicleFactory1.getVehicle("Ordinary", "Suzuki");
        vehicle1.drive();

        VehicleFactory vehicleFactory2 = new VehicleFactory();
        Vehicle vehicle2 = vehicleFactory2.getVehicle("Luxury", "Suzuki");
        vehicle2.drive();
    }
}
