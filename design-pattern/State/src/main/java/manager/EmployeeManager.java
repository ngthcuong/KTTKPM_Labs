package manager;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;

    public  EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployeeTasks(String employeeId) {
        for (Employee emp: employees) {
            if (emp.getId().equals(employeeId)) {
                emp.displayTasks();
                return;
            }
        }
        System.out.println("Employee not found with id: " + employeeId);
    }
}
