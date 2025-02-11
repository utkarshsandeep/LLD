package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Decorator;

import SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Base.BasePizza;

public class Onion implements PizzaDecorator {
    private final int cost = 20;
    private final BasePizza basePizza;

    public Onion(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + cost;
    }
}
