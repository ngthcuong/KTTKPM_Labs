package decorator;

import component.Employee;

import java.util.List;

public abstract class TaskDecorator implements Employee {
    protected Employee employee;

    public TaskDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public List<String> getTasks() {
        return employee.getTasks();
    }
}
