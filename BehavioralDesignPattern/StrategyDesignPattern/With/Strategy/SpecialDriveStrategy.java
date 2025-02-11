package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.With.Strategy;

public class SpecialDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving vehicle specially");
    }
}
