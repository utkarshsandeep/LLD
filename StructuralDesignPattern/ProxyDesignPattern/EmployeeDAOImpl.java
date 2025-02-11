package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.ProxyDesignPattern;

public class EmployeeDAOImpl implements EmployeeDAO{
    @Override
    public void createEmployee(String client, Employee employee) {
        // create employee
        System.out.println("Employee created");
    }

    @Override
    public void deleteEmployee(String client, int employeeId) {
        // delete employee
        System.out.println("Employee deleted for id : " + employeeId);
    }

    @Override
    public Employee findEmployee(String client, int employeeId) {
        // find employee
        System.out.println("Employee found for id : " + employeeId);
        return new Employee();
    }
}
