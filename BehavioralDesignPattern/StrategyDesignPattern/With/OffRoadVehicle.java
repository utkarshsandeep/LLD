package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.With;

import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.StrategyDesignPattern.With.Strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SpecialDriveStrategy());
    }
}
