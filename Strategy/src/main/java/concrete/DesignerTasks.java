package concrete;

import strategy.TaskStrategy;

import java.util.Arrays;
import java.util.List;

public class DesignerTasks implements TaskStrategy {
    @Override
    public List<String> getTasks() {
        return Arrays.asList("Thiết kế giao diện", "Lên ý tưởng", "Nghiên cứu UX");
    }
}
