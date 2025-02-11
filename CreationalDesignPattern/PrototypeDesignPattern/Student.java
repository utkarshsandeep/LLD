package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.PrototypeDesignPattern;

public class Student implements Prototype{

    private String name;
    private int age;
    private int rollNo;

    public Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    @Override
    public Prototype clone() {
        return new Student(name, age, rollNo);
    }
}
