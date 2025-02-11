package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {
        Director director1 = new Director(new EngineerStudentBuilder());
        Director director2 = new Director(new MBAStudentBuilder());

        Student engineer = director1.createStudent();
        Student mba = director2.createStudent();

        System.out.println(engineer.toString());
        System.out.println(mba.toString());
    }
}
