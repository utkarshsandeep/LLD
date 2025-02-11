package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.TemplateDesignPattern;

public abstract class PaymentFlow {
    public abstract void validateRequest();
    public abstract void calculateFees();
    public abstract void creditPayment();
    public abstract void debitPayment();

    public final void sendMoney() {
        validateRequest();
        debitPayment();
        calculateFees();
        creditPayment();
    }
}
