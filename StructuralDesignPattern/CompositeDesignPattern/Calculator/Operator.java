package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.CompositeDesignPattern.Calculator;

public class Operator implements Expression {

    Expression leftExpression;
    Symbol symbol;
    Expression rightExpression;

    public Operator(Expression lE, Symbol s, Expression rE) {
        leftExpression = lE;
        symbol = s;
        rightExpression = rE;
    }

    @Override
    public int evaluate() {
        int value = 0;

        switch (symbol) {
            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUB:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
            case DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
        }
        System.out.println("Evaluated value : " + value);
        return value;
    }
}
