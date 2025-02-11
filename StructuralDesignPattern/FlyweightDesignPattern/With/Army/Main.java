package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.FlyweightDesignPattern.With.Army;

public class Main {
    public static void main(String[] args) {
        Robot humanRobot = RobotFactory.createRobot("Humanoid");
        humanRobot.display(10,20);

        Robot humanRobot2 = RobotFactory.createRobot("Humanoid");
        humanRobot2.display(20,30);

        Robot dogRobot = RobotFactory.createRobot("DogRobot");
        dogRobot.display(10,20);

        Robot dogRobot2 = RobotFactory.createRobot("DogRobot");
        dogRobot2.display(20,30);

    }
}
