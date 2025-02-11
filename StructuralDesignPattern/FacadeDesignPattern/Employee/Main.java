package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.FacadeDesignPattern.Employee;

public class Main {
    public static void main(String[] args) {
        EmployeeFacade employeeFacade = new EmployeeFacade();
        employeeFacade.getEmployeeDetails(123);
    }
}
