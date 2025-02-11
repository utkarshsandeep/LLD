package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.MementoDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {

    public List<ConfigurationMemento> history = new ArrayList<>();

    public void addMemento(ConfigurationMemento memento) {
        history.add(memento);
    }

    public ConfigurationMemento undo() {
        if (!history.isEmpty()) {
            int index = history.size() - 1;
            ConfigurationMemento memento = history.get(index);
            history.remove(index);
            return memento;
        }
        return null;
    }
}
