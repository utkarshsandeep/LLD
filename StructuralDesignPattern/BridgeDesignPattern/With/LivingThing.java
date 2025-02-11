package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.BridgeDesignPattern.With;

import SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.BridgeDesignPattern.With.Implementor.BreatheImplementor;

public abstract class LivingThing {
    BreatheImplementor breatheImplementor;

    public LivingThing(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    public abstract void breatheProcess();
}
