package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory obj = new ShapeFactory();
        Shape drawShape = obj.getShape("Rectangle");
        drawShape.draw();
    }
}
