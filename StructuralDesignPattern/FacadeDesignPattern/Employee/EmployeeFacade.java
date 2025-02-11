package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.FacadeDesignPattern.Employee;

public class EmployeeFacade {
    private EmployeeDAO employeeDAO;

    public EmployeeFacade() {
        employeeDAO = new EmployeeDAO();
    }

    public void insert() {
        employeeDAO.insert();
    }

    public Employee getEmployeeDetails(int employeeId) {
        return employeeDAO.getEmployeeDetails(employeeId);
    }
}
