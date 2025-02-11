package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.ChainOfResponsibilityDesignPattern;

public class DebugLogger extends Logger{
    public DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == DEBUG) {
            System.out.println("Debug Log: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
