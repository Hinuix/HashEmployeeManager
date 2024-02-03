import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private Map<String, Double> employeeSalaries;

    public EmployeeManagementSystem() {
        employeeSalaries = new HashMap<>();
    }

    public void addEmployee(String name, double salary) {
        employeeSalaries.put(name, salary);
    }

    public void printEmployees() {
        System.out.println("Employee List:");
        for (Map.Entry<String, Double> entry : employeeSalaries.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Salary: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        // Add some initial employees
        ems.addEmployee("John Doe", 50000);
        ems.addEmployee("Jane Smith", 60000);

        while (true) {
            System.out.println("\nEmployee Management System Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Print Employees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble();
                    ems.addEmployee(name, salary);
                    System.out.println("Employee added successfully.");
                    break;
                case 2:
                    ems.printEmployees();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
