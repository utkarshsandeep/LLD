package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.SingletonDesignPattern.DoubleLocking;

public class Sample3 {
    private static Sample3 instance;

    private Sample3() {
    }

    public static Sample3 getInstance() {
        if (instance == null) {
            synchronized (Sample3.class) {
                if (instance == null) {
                    instance = new Sample3();
                }
            }
        }
        return instance;
    }
}
