package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.FlyweightDesignPattern.Without;

public class Robot {
    String type;
    String body;
    int coordinateX;
    int coordinateY;

    public Robot(String type, String body, int coordinateX, int coordinateY) {
        this.type = type;
        this.body = body;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }
}
