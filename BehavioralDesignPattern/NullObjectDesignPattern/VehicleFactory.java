package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.NullObjectDesignPattern;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType.equals("Car")) {
            return new Car();
        } else if (vehicleType.equals("Bike")) {
            return new Bike();
        }
        return new NullVehicle();
    }
}
