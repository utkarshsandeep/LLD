package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.InterpreterDesignPattern;

public class NumberTerminalExpression implements AbstractExpression{

    public String strValue;

    public NumberTerminalExpression(String strValue) {
        this.strValue = strValue;
    }

    @Override
    public int interpret(Context context) {
        return context.get(strValue);
    }
}
