package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.BuilderDesignPattern;

import java.util.List;

public class EngineerStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubject() {
        List<String> subjects = List.of("ADS", "OS", "C");
        this.subjects = subjects;
        return this;
    }
}
