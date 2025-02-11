package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.BuilderDesignPattern;

import java.util.List;

public abstract class StudentBuilder {
    int rollNumber;
    String name;
    int age;
    String fatherName;
    String motherName;
    List<String> subjects;

    public StudentBuilder setRollNo(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public abstract StudentBuilder setSubject();

    public Student build(){
        return new Student(this);
    }
}
