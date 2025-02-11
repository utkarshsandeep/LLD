package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.AbstractFactoryDesignPattern;

public class Audi implements LuxuryVehicle {
    @Override
    public void drive() {
        System.out.println("Audi");
    }
}
