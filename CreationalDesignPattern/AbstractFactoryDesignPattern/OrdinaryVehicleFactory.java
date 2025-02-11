package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.AbstractFactoryDesignPattern;

public class OrdinaryVehicleFactory {
    OrdinaryVehicle getVehicle(String input) {
        if (input.equals("Tata")) {
            return new Tata();
        } else if (input.equals("Hyundai")) {
            return new Hyundai();
        } else if (input.equals("Suzuki")) {
            return new Suzuki();
        } else {
            return null;
        }
    }
}
