package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.With.Strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving vehicle normally");
    }
}
