package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.ChainOfResponsibilityDesignPattern;

public class ErrorLogger extends Logger {
    public ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(int level, String message) {
        if (level == ERROR) {
            System.out.println("Error Log: " + message);
        } else {
            nextLogger.log(level, message);
        }
    }
}
