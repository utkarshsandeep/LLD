package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.TemplateDesignPattern;

public class SendMoneyToFriend extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validating request for sending money to friend");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculating fees 0% for sending money to friend");
    }

    @Override
    public void creditPayment() {
        System.out.println("Crediting payment for sending money to friend");
    }

    @Override
    public void debitPayment() {
        System.out.println("Debiting payment for sending money to friend");
    }
}
