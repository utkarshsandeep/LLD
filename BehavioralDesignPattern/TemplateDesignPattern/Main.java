package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.TemplateDesignPattern;

public class Main {
    public static void main(String[] args) {
        PaymentFlow sendMoneyToFriendObj = new SendMoneyToFriend();
        sendMoneyToFriendObj.sendMoney();
    }
}
