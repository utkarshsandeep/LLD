package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.AbstractFactoryDesignPattern;

public class BMW implements LuxuryVehicle {
    @Override
    public void drive() {
        System.out.println("BMW");
    }
}
