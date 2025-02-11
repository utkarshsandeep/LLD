package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.CommandDesignPattern;

public class ReceiverAirConditioner {
    public boolean isOn;
    public int temperature;

    public void turnOnAc() {
        isOn = true;
        System.out.println("AC is on");
    }

    public void turnOffAc() {
        isOn = false;
        System.out.println("AC is off");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to " + temperature);
    }
}
