package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.ChainOfResponsibilityDesignPattern;

public class InfoLogger extends Logger{

    public InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(int logLevel, String message) {
        if (logLevel == Logger.INFO) {
            System.out.println("InfoLogger: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
