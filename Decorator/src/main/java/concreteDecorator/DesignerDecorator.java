package concreteDecorator;

import component.Employee;
import decorator.TaskDecorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesignerDecorator extends TaskDecorator {
    public DesignerDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public List<String> getTasks() {
        List<String> tasks = new ArrayList<>(super.getTasks());
        tasks.addAll(Arrays.asList(
                "Thiết kế giao diện",
                "Tạo prototype",
                "Nghiên cứu UX",
                "Hỗ trợ team dev"
        ));
        return tasks;
    }
}
