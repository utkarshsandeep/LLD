package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.ProxyDesignPattern;

public interface EmployeeDAO {
    public void createEmployee(String client, Employee employee);
    public void deleteEmployee(String client, int employeeId);
    public Employee findEmployee(String client, int employeeId);
}
