package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.SingletonDesignPattern;

import SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.SingletonDesignPattern.LazyInitialization.Sample2;
import SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.SingletonDesignPattern.EagerInitialization.Sample1;

public class Main {
    public static void main(String[] args) {
        Sample1 obj1 = Sample1.getInstance();
        Sample1 obj2 = Sample1.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1 == obj2);

        Sample2 obj11 = Sample2.getInstance();
        Sample2 obj22 = Sample2.getInstance();
        System.out.println(obj11);
        System.out.println(obj22);
        System.out.println(obj11 == obj22);
    }
}
