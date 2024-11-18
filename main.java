class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;

    public Employee(int employeeId, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Full Name: " + getFullName());
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Manager extends Employee {
    private String department;

    public Manager(int employeeId, String firstName, String lastName, String department) {
        super(employeeId, firstName, lastName);
        this.department = department;
    }

    @Override
    public String getFullName() {
        return "Manager: " + super.getFullName();
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }

    public String getDepartment() {
        return department;
    }
}

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee(101, "Eyobed", "Israel");
        System.out.println("Employee Info:");
        emp.displayInfo();

        System.out.println();

        Manager mgr = new Manager(201, "Abebe", "Kebede", "HR");
        System.out.println("Manager Info:");
        mgr.displayInfo();
    }
}
