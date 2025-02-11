package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.NullObjectDesignPattern;

public class Car implements Vehicle{
    @Override
    public int getFuelCapacity() {
        return 30;
    }

    @Override
    public int getSeatCapacity() {
        return 5;
    }
}
