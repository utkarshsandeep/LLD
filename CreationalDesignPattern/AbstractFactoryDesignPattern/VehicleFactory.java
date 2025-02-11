package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.AbstractFactoryDesignPattern;

public class VehicleFactory {
    Vehicle getVehicle(String vehicle, String input) {
        if (vehicle.equals("Luxury")) {
            LuxuryVehicleFactory luxuryVehicleFactory = new LuxuryVehicleFactory();
            return luxuryVehicleFactory.getVehicle(input);
        } else if (vehicle.equals("Ordinary")) {
            OrdinaryVehicleFactory ordinaryVehicleFactory = new OrdinaryVehicleFactory();
            return ordinaryVehicleFactory.getVehicle(input);
        } else {
            return null;
        }
    }
}
