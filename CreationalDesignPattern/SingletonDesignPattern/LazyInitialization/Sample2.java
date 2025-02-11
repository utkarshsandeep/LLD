package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.SingletonDesignPattern.LazyInitialization;

public class Sample2 {
    private static Sample2 instance;

    private Sample2() {
    }

    public static Sample2 getInstance() {
        if (instance == null) {
            instance = new Sample2();
        }
        return instance;
    }
}
