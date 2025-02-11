package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.BuilderDesignPattern;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceof EngineerStudentBuilder) {
            return createEngineerStudent();
        } else if (studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        } else {
            return null;
        }
    }

    private Student createEngineerStudent() {
        return studentBuilder.setRollNo(1).setName("John").setAge(22).setSubject().build();
    }

    private Student createMBAStudent() {
        return studentBuilder.setRollNo(2).setName("Doe").setAge(23).setSubject().build();
    }
}
