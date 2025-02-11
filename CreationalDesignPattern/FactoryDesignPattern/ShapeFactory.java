package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.FactoryDesignPattern;

public class ShapeFactory {
    Shape getShape(String input) {
        switch (input) {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Square":
                return new Square();
            default:
                return null;
        }
    }
}
