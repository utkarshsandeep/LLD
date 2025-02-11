package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.MementoDesignPattern;

public class Main {
    public static void main(String[] args) {
        ConfigurationCareTaker configurationCareTaker = new ConfigurationCareTaker();

        ConfigurationOriginator configurationOriginator = new ConfigurationOriginator(100, 200);

        ConfigurationMemento snapShot1 = configurationOriginator.createMemento();
        configurationCareTaker.addMemento(snapShot1);

        configurationOriginator.setHeight(300);
        configurationOriginator.setWidth(400);

        ConfigurationMemento snapShot2 = configurationOriginator.createMemento();
        configurationCareTaker.addMemento(snapShot2);

        configurationOriginator.setHeight(500);
        configurationOriginator.setWidth(600);

        ConfigurationMemento restoredMemento = configurationCareTaker.undo();
        configurationOriginator.restoreMemento(restoredMemento);

        System.out.println("Height: " + configurationOriginator.height);
        System.out.println("Width: " + configurationOriginator.width);
    }
}
