package concreteDecorator;

import component.Employee;
import decorator.TaskDecorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagerDecorator extends TaskDecorator {
    public ManagerDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public List<String> getTasks() {
        List<String> tasks = new ArrayList<>(super.getTasks());
        tasks.addAll(Arrays.asList(
                "Lên kế hoạch dự án",
                "Quản lý đội nhóm",
                "Báo cáo tiến độ",
                "Họp với khách hàng"
        ));
        return tasks;
    }
}
