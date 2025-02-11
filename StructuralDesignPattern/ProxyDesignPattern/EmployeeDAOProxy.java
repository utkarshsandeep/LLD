package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.ProxyDesignPattern;

public class EmployeeDAOProxy implements EmployeeDAO {

    EmployeeDAO employeeDAOObj;

    public EmployeeDAOProxy() {
        employeeDAOObj = new EmployeeDAOImpl();
    }

    @Override
    public void createEmployee(String client, Employee employee) {
        if (client.equals("ADMIN")) {
            employeeDAOObj.createEmployee(client, employee);
        } else {
            System.out.println("You are not authorized to create employee");
        }
    }

    @Override
    public void deleteEmployee(String client, int employeeId) {
        if (client.equals("ADMIN")) {
            employeeDAOObj.deleteEmployee(client, employeeId);
        } else {
            System.out.println("You are not authorized to delete employee");
        }
    }

    @Override
    public Employee findEmployee(String client, int employeeId) {
        if (client.equals("ADMIN") || client.equals("USER")) {
            return employeeDAOObj.findEmployee(client, employeeId);
        } else {
            System.out.println("You are not authorized to find employee");
        }
        return null;
    }
}
