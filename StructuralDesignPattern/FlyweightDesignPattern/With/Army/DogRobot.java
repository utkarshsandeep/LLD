package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.FlyweightDesignPattern.With.Army;

public class DogRobot implements Robot{

    private String robotType;
    private String robotBody;

    public DogRobot(String robotType, String robotBody) {
        this.robotType = robotType;
        this.robotBody = robotBody;
    }

    public String getRobotType() {
        return robotType;
    }

    public String getRobotBody() {
        return robotBody;
    }

    @Override
    public void display(int x, int y) {

    }
}
