package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern;

import SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Base.BasePizza;
import SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Base.Farmhouse;
import SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Decorator.CheeseBurst;
import SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern.Decorator.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza1 = new Farmhouse();
        System.out.println(pizza1.cost());
        BasePizza pizza2 = new Farmhouse();
        pizza2 = new CheeseBurst(pizza2);
        System.out.println(pizza2.cost());
        BasePizza pizza3 = new Farmhouse();
        pizza3 = new Mushroom(new CheeseBurst(pizza3));
        System.out.println(pizza3.cost());
    }
}
