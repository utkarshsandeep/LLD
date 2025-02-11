package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.CompositeDesignPattern.Calculator;

public class Number implements Expression{

    int num;

    public Number(int n) {
        num = n;
    }

    @Override
    public int evaluate() {
        System.out.println("Number is " + num);
        return num;
    }
}
