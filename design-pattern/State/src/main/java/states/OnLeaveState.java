package states;

import entities.Employee;

public class OnLeaveState implements EmployeeState{
    @Override
    public void setEmployeeState(EmployeeState employeeState) {

    }

    @Override
    public void displayTasks(Employee employee) {
        System.out.println(employee.getFullName() + "đã nghỉ phép, không có công việc nào được giao!");
    }
}
