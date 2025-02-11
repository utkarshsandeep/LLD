package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.ProxyDesignPattern;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO obj = new EmployeeDAOProxy();
        obj.createEmployee("ADMIN", new Employee());
    }
}
