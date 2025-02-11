package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.FacadeDesignPattern.Employee;

public class EmployeeDAO {

    public void insert() {
        //insert new employee
    }

    public void updateEmployee() {
        //update employee
    }

    public Employee getEmployeeDetails(String emailId) {
        //get employee details
        return new Employee();
    }

    public Employee getEmployeeDetails(int employeeId) {
        //get employee details
        return new Employee();
    }
}
