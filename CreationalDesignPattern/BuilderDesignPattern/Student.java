package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.BuilderDesignPattern;

import java.util.List;

public class Student {
    int rollNumber;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.rollNumber = studentBuilder.rollNumber;
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.subjects = studentBuilder.subjects;
    }

    public String toString() {
        return "" + "roll Number : " + this.rollNumber +
                " age : " + this.age +
                " name : " + this.name +
                " father name : " + this.fatherName +
                " mother name : " + this.motherName +
                " subjects : " + this.subjects;
    }
}
