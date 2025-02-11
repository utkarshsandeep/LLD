package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.FlyweightDesignPattern.With.Army;

public class HumanRobot implements Robot{

    private String robotType;
    private String robotBody;

    public HumanRobot(String robotType, String robotBody) {
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
