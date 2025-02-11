package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.CompositeDesignPattern.Calculator;

public class Main {
    public static void main(String[] args) {
        Expression a = new Number(2);
        Expression b = new Number(7);
        Expression c = new Number(1);
        Expression d = new Operator(b, Symbol.ADD, c);
        Expression e = new Operator(a, Symbol.MULTIPLY, d);
        e.evaluate();
    }
}
