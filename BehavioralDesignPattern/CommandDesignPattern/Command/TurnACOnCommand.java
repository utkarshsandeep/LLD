package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.CommandDesignPattern.Command;

import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.CommandDesignPattern.ReceiverAirConditioner;

public class TurnACOnCommand implements Command {
    ReceiverAirConditioner airConditioner;

    public TurnACOnCommand(ReceiverAirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOnAc();
    }

    @Override
    public void undo() {
        airConditioner.turnOffAc();
    }
}
