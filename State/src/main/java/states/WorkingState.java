package states;

import entities.Employee;
import entities.Task;

public class WorkingState implements EmployeeState{
    @Override
    public void setEmployeeState(EmployeeState employeeState) {

    }

    @Override
    public void displayTasks(Employee employee) {
        System.out.println("Công việc của " + employee.getFullName() + " (Chức vụ: " + employee.getPosition().getName() + "):");
        for (Task task : employee.getPosition().getTasks()) {
            System.out.println(task);
        }
    }
}
