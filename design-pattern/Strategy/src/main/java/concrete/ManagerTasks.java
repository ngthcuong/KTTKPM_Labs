package concrete;

import strategy.TaskStrategy;

import java.util.Arrays;
import java.util.List;

public class ManagerTasks implements TaskStrategy {
    @Override
    public List<String> getTasks() {
        return Arrays.asList("Lên kết hoạch dự án", "Quản lý nhóm", "Báo cáo tiến độ");
    }
}
