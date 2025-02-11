package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Decorator;

import SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Base.BasePizza;

public class Mushroom implements PizzaDecorator {
    private final int cost = 30;
    private final BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + cost;
    }
}
