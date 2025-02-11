package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.AbstractFactoryDesignPattern;

public class LuxuryVehicleFactory {
    LuxuryVehicle getVehicle(String input) {
        if (input.equals("BMW")) {
            return new BMW();
        } else if (input.equals("Audi")) {
            return new Audi();
        } else if (input.equals("Mercedes")) {
            return new Mercedes();
        } else {
            return null;
        }
    }
}
