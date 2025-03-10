package concrete;

import strategy.TaskStrategy;

import java.util.Arrays;
import java.util.List;

public class DeveloperTasks implements TaskStrategy {
    @Override
    public List<String> getTasks() {
        return Arrays.asList("Viết code", "Fix bug", "Tham gia meeting");
    }
}
