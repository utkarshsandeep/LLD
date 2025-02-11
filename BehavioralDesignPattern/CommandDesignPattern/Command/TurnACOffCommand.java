package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.CommandDesignPattern.Command;

import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.CommandDesignPattern.ReceiverAirConditioner;

public class TurnACOffCommand implements Command{
    ReceiverAirConditioner airConditioner;

    public TurnACOffCommand(ReceiverAirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOffAc();
    }

    @Override
    public void undo() {
        airConditioner.turnOnAc();
    }
}
