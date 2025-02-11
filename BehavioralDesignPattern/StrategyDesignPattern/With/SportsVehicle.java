package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.With;

import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.With.Strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}
