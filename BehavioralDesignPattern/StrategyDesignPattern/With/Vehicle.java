package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.With;

import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.With.Strategy.DriveStrategy;

public class Vehicle {
    public DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
