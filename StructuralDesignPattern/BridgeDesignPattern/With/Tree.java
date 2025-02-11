package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.BridgeDesignPattern.With;

import SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.BridgeDesignPattern.With.Implementor.BreatheImplementor;

public class Tree extends LivingThing{
    public Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}
