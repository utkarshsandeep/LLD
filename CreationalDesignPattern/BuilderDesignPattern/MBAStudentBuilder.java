package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.BuilderDesignPattern;

import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubject() {
        List<String> subjects = List.of("Ecconomics", "Marketing", "Finance");
        this.subjects = subjects;
        return this;
    }
}
