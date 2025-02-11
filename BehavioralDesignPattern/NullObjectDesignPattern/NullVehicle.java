package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.NullObjectDesignPattern;

public class NullVehicle implements Vehicle{
    @Override
    public int getFuelCapacity() {
        return 0;
    }

    @Override
    public int getSeatCapacity() {
        return 0;
    }
}
