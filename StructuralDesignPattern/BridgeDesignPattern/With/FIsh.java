package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.BridgeDesignPattern.With;

import SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.BridgeDesignPattern.With.Implementor.BreatheImplementor;

public class FIsh extends LivingThing{
    public FIsh(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }
    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}
