package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.AbstractFactoryDesignPattern;

public class Mercedes implements LuxuryVehicle {
    @Override
    public void drive() {
        System.out.println("Mercedes");
    }
}
