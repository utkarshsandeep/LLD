package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.TemplateDesignPattern;

public class SendMoneyToMerchant extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validating request for sending money to merchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculating fees 2% for sending money to merchant");
    }

    @Override
    public void creditPayment() {
        System.out.println("Crediting payment for sending money to merchant");
    }

    @Override
    public void debitPayment() {
        System.out.println("Debiting payment for sending money to merchant");
    }
}
