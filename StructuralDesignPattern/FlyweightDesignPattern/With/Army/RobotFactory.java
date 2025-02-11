package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.FlyweightDesignPattern.With.Army;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RobotFactory {
    public static Map<String, Robot> robotCache = new HashMap<>();

    public static Robot createRobot(String robotType) {
        if (robotCache.containsKey(robotType)) {
            return robotCache.get(robotType);
        } else {
            if (Objects.equals(robotType, "Humanoid")) {
                Robot humanRobot = new HumanRobot(robotType, "Human Body");
                robotCache.put(robotType, humanRobot);
                return humanRobot;
            } else if (Objects.equals(robotType, "DogRobot")) {
                Robot dogRobot = new DogRobot(robotType, "Dog Body");
                robotCache.put(robotType, dogRobot);
                return dogRobot;
            }
            return null;
        }
    }
}
