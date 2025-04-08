package concreteDecorator;

import component.Employee;
import decorator.TaskDecorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeveloperDecorator extends TaskDecorator {
    public DeveloperDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public List<String> getTasks() {
        List<String> tasks = new ArrayList<>(super.getTasks());
        tasks.addAll(Arrays.asList(
                "Viết code",
                "Fix bug",
                "Tham gia code review",
                "Unit test"
        ));
        return tasks;
    }
}