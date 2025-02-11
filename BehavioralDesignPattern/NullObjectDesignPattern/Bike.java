package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.NullObjectDesignPattern;

public class Bike implements Vehicle{
    @Override
    public int getFuelCapacity() {
        return 15;
    }

    @Override
    public int getSeatCapacity() {
        return 2;
    }
}
