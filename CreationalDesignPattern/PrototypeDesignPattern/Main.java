package SystemDesign.LLD.DesignPatterns.CreationalDesignPattern.PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 20, 1);
        Student cloneStudent = (Student) student.clone();
        System.out.println(cloneStudent);
    }
}
