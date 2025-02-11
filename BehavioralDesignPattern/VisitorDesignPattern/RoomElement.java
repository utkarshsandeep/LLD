package SystemDesign.LLD.DesignPatterns.BehavioralDesignPattern.VisitorDesignPattern;

public interface RoomElement {
    public void accept(RoomVisitor visitor);
}
