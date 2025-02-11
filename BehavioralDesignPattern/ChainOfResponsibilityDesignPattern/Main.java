package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.ChainOfResponsibilityDesignPattern;

public class Main {
    public static void main(String[] args) {
        Logger logObject = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        logObject.log(Logger.INFO, "This is an information message");
        logObject.log(Logger.DEBUG, "This is a debug message");
        logObject.log(Logger.ERROR, "This is an error message");
    }
}
