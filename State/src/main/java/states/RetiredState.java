package states;

import entities.Employee;

public class RetiredState implements EmployeeState {
    @Override
    public void setEmployeeState(EmployeeState employeeState) {

    }

    @Override
    public void displayTasks(Employee employee) {
        System.out.println(employee.getFullName() + "đã nghỉ làm!");
    }
}
