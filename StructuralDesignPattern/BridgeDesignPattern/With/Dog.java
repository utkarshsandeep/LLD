package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.BridgeDesignPattern.With;

import SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.BridgeDesignPattern.With.Implementor.BreatheImplementor;

public class Dog extends LivingThing{

    public Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}
