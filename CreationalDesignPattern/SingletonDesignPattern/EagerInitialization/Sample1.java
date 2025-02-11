package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.SingletonDesignPattern.EagerInitialization;

public class Sample1 {
    private static final Sample1 instance = new Sample1();

    private Sample1() {
    }

    public static Sample1 getInstance() {
        return instance;
    }
}
