package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.CommandDesignPattern;

import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.CommandDesignPattern.Command.TurnACOnCommand;

public class Main {
    public static void main(String[] args) {
        ReceiverAirConditioner airConditioner = new ReceiverAirConditioner();
        InvokerRemoteControl remoteControl = new InvokerRemoteControl();
        remoteControl.setCommand(new TurnACOnCommand(airConditioner));
        remoteControl.pressButton();
        remoteControl.undo();
    }
}
