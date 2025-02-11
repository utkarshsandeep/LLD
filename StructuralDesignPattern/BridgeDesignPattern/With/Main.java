package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.BridgeDesignPattern.With;

import SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.BridgeDesignPattern.With.Implementor.WaterBreatheImplementor;

public class Main {
    public static void main(String[] args) {
        LivingThing fish = new FIsh(new WaterBreatheImplementor());
        fish.breatheProcess();
    }
}
