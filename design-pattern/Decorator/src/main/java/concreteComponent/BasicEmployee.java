package concreteComponent;

import component.Employee;

import java.util.Arrays;
import java.util.List;

public class BasicEmployee implements Employee {
    private String name;

    public BasicEmployee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List<String> getTasks() {
        return Arrays.asList("Lên ý tưởng", "Báo cáo tiến độ");
    }
}
