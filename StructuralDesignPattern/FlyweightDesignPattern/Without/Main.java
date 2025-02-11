package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.FlyweightDesignPattern.Without;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        for (int i =0;i<100000;i++) {
            Robot humanRobot = new Robot("Humanoid","Human Body", x+i, y+i);
        }

        for (int i =0;i<100000;i++) {
            Robot dogRobot = new Robot("DogRobot","Dog Body", x+i, y+i);
        }
    }
}
