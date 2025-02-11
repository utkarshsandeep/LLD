package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Decorator;

import SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Base.BasePizza;

public class CheeseBurst implements PizzaDecorator {
    private final int cost = 50;
    private final BasePizza basePizza;

    public CheeseBurst(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + cost;
    }
}
