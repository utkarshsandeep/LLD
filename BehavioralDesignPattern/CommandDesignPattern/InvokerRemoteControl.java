package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.CommandDesignPattern;

import SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.CommandDesignPattern.Command.Command;

import java.util.Stack;

public class InvokerRemoteControl {
    private Command command;
    Stack<Command> historyCommands = new Stack<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        historyCommands.push(command);
    }

    public void undo() {
        if (!historyCommands.isEmpty()) {
            Command command = historyCommands.pop();
            command.undo();
        }
    }
}
