package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.FacadeDesignPattern.Employee;

public class Employee {
    private String name;
    private String id;
    private String address;
    private String designation;
    private String department;

    public Employee(String name, String id, String address, String designation, String department) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.designation = designation;
        this.department = department;
    }

    public Employee() {
        this.name = "John";
        this.id = "123";
        this.address = "123, New York";
        this.designation = "Software Engineer";
        this.department = "IT";
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }
}
