package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.InterpreterDesignPattern;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a", 10);
        context.put("b", 20);
        context.put("c", 30);
        context.put("d", 40);
        //a*b
        AbstractExpression expression = new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b"));
        System.out.println(expression.interpret(context));
        //(a*b) + (c*d)
        AbstractExpression expression1 = new AddNonTerminalExpression(new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b")),
                new MultiplyNonTerminalExpression(new NumberTerminalExpression("c"), new NumberTerminalExpression("d")));
        System.out.println(expression1.interpret(context));
    }
}
