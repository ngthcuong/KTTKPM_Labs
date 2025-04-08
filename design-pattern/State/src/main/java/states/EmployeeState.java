package states;

import entities.Employee;

public interface EmployeeState {
    void setEmployeeState(EmployeeState employeeState);
    void displayTasks(Employee employee);
}
